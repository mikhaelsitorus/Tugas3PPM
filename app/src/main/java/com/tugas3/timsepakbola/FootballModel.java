package com.tugas3.timsepakbola;

public class FootballModel {
    public String getNamaTeam() {
        return namaTeam;
    }

    public void setNamaTeam(String namaTeam) {
        this.namaTeam = namaTeam;
    }

    private String namaTeam;
    private int lambangTeam;

    public int getLambangTeam() {
        return lambangTeam;
    }

    public void setLambangTeam(int lambangTeam) {
        this.lambangTeam = lambangTeam;
    }
}