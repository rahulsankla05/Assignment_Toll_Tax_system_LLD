package org.example.services;

import org.example.models.*;
//import org.example.models.Toll_Booth;
//import org.example.models.Toll_Pass;

import java.util.ArrayList;
import java.util.List;
public class LeaderBoardService {
    public void updateLeaderboard(Toll_Booth tollBooth, Toll_Pass toll_pass) {
    }
    public Leaderboard getToll_Booth_Leaderboard(Toll toll, Toll_Booth toll_booth) {
        List<Toll_Pass> Pass_list = new ArrayList<>();
        return getToll_Booth_Leaderboard(toll,toll_booth);
    }
    /*
    Here i'm facing error //
     */
    public Leaderboard getToll_Leaderboard(Toll toll) {
        if(getToll_Leaderboard(toll)==null){
            return null;
        }
        return getToll_Leaderboard(toll);
    }
    private double getTotalAmount(List<Toll_Pass> Pass_list){
        double totalAmount = 0.0;
        for(Toll_Pass pass:Pass_list){
            totalAmount+=pass.getBill().getAmount();
        }
        return totalAmount;
    }
}