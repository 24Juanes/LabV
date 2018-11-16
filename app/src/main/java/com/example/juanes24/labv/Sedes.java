package com.example.juanes24.labv;

public class Sedes {

    private String sedes;
    private String info;
    private int foto;

    public Sedes(){

    }

    public Sedes(String sedes, String info, int foto) {
        this.sedes = sedes;
        this.info = info;
        this.foto = foto;
    }

    public String getSedes() {
        return sedes;
    }

    public void setRestaurante(String sedes) {
        this.sedes = sedes;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}