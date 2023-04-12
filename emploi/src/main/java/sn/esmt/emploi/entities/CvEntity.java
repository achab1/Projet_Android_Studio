package sn.esmt.emploi.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "cvs")
public class CvEntity {

    @Id //JPA Id est cle primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(length = 150, nullable = false)
    private String nom;

    @Column(length = 100, nullable = false)
    private String prenom;

    private int age;

    @Column(length = 200, nullable = false,unique = true)
    private String adresse;

    @Column(length = 200, nullable = false,unique = true)
    private String email;

    @Column(length = 200, nullable = false,unique = true)
    private String telephone;

    @Column(length = 200, nullable = false,unique = true)
    private String specialite;

    @Column(length = 200, nullable = false,unique = true)
    private String niveauEtude;

    @Column(length = 200, nullable = false,unique = true)
    private String experienceProfessionnelle;



}
