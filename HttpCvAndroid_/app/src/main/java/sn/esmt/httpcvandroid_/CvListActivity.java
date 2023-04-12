package sn.esmt.httpcvandroid_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import sn.esmt.httpcvandroid_.httpconfig.Api;
import sn.esmt.httpcvandroid_.httpconfig.CvsResponse;
import sn.esmt.httpcvandroid_.tools.MyAdapterCv;

public class CvListActivity extends AppCompatActivity {


    private ListView list;
    private ArrayList<CvsResponse> cvs = new ArrayList<CvsResponse>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cvlist);
        list = (ListView) findViewById(R.id.listview_cv);
        chargerListe();
    }
    public void chargerListe(){

        //Création de l'objet Retrofit pour accéder à l'API
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.5:8180") //URL de base de l'API
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //Crée une instance de l'interface Api,
        //qui définit les méthodes pour les appels HTTP.
        Api api = retrofit.create(Api.class);

        //creation d'un objet Call pour l'appel à la méthode login() de l'interface Api.
        Call<ArrayList<CvsResponse>> call = api.all();

        call.enqueue(new Callback<ArrayList<CvsResponse>>() {
            @Override
            public void onResponse(Call<ArrayList<CvsResponse>> call, Response<ArrayList<CvsResponse>> response) {
                if (response.isSuccessful()) {
                    Log.d("Response :", response.body().get(0).getEmail());
                    response.body().stream().forEach(cvsResponse -> cvs.add(cvsResponse));
                    MyAdapterCv adpt = new MyAdapterCv(CvListActivity.this,cvs);
                    Log.d("Debbugage : " , cvs.get(0).getNom());
                    list.setAdapter(adpt);
                } else {
                    Log.d("error message exception", response.toString());

                }
            }

            @Override
            public void onFailure(Call<ArrayList<CvsResponse>> call, Throwable t) {
                Log.d("Error : ", t.getMessage());
                //D/Error :: CLEARTEXT communication to 192.168.90.167 not permitted by network security policy
            }

        });


    }
}