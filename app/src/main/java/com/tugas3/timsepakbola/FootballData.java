package com.tugas3.timsepakbola;

import java.util.ArrayList;

public class FootballData {
    private static String[] title = new String[]{"Arema FC", "Persebaya Surabaya", "Persib Bandung", "Persija Jakarta",
            "PSIS Semarang", "PSM Makassar", "Persipura Jayapura"};
    private static int[] thumbnail = new
            int[]{R.drawable.arema, R.drawable.persebaya, R.drawable.persib, R.drawable.persija, R.drawable.psis, R.drawable.psm, R.drawable.persipura};

    public static ArrayList<FootballModel> getListData() {
        FootballModel footballModel = null;
        ArrayList<FootballModel> list = new ArrayList<>();
        for (int i = 0; i < title.length; i++) {
            footballModel = new FootballModel();
            footballModel.setLambangTeam(thumbnail[i]);
            footballModel.setNamaTeam(title[i]);
            list.add(footballModel);
        }
        return list;
    }
}