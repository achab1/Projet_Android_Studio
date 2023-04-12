package sn.esmt.httpcvandroid_.tools;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import sn.esmt.httpcvandroid_.R;
import sn.esmt.httpcvandroid_.httpconfig.CvsResponse;

public class MyAdapterCv extends BaseAdapter {

    private ArrayList<CvsResponse> cvs;
    private LayoutInflater myInflater;

    public MyAdapterCv(Context context, ArrayList<CvsResponse> cvs)
    {
        this.myInflater = LayoutInflater.from(context);
        this.cvs= cvs;
    }

    @Override
    public  int getCount() {
        return this.cvs.size();
    }
    @Override
    public Object getItem (int arg0){
        return this.cvs.get(arg0);
    }

    @Override
    public long getItemId (int position){
        return position;
    }

    public static class ViewHolder {

        TextView textid;
        TextView textnom;
        TextView textprenom;
        TextView textage;
        TextView textadresse;
        TextView textemail;
        TextView texttelephone;
        TextView textspecialite;
        TextView textniveauEtude;
        TextView textexperienceProfessionnelle;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;


        if (convertView == null)
        {
            convertView = myInflater.inflate(R.layout.listview_cv_item, null);
            holder = new ViewHolder();
            holder.textid = (TextView) convertView.findViewById(R.id.txtid);
            holder.textnom = (TextView) convertView.findViewById(R.id.txtnom);
            holder.textprenom = (TextView) convertView.findViewById(R.id.txtprenom);
            holder.textage = (TextView) convertView.findViewById(R.id.txtage);
            holder.textadresse = (TextView) convertView.findViewById(R.id.txtadresse);
            holder.textemail = (TextView) convertView.findViewById(R.id.txtemail);
            holder.texttelephone = (TextView) convertView.findViewById(R.id.txttelephone);
            holder.textspecialite = (TextView) convertView.findViewById(R.id.txtspecialite);
            holder.textniveauEtude = (TextView) convertView.findViewById(R.id.txtniveauEtude);
            holder.textexperienceProfessionnelle = (TextView) convertView.findViewById(R.id.txtexperienceProfessionnelle);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.textid.setText(cvs.get(position).getId()+"");
        holder.textnom.setText(cvs.get(position).getNom());
        holder.textprenom.setText(cvs.get(position).getPrenom());
        holder.textage.setText(cvs.get(position).getAge());
        holder.textadresse.setText(cvs.get(position).getAdresse());
        holder.textemail.setText(cvs.get(position).getEmail());
        holder.texttelephone.setText(cvs.get(position).getTelephone());
        holder.textspecialite.setText(cvs.get(position).getSpecialite());
        holder.textniveauEtude.setText(cvs.get(position).getNiveauEtude());
        holder.textexperienceProfessionnelle.setText(cvs.get(position).getExperienceProfessionnelle());

        return convertView;

    }

}
