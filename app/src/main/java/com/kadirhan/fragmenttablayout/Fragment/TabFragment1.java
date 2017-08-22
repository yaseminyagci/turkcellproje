package com.kadirhan.fragmenttablayout.Fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kadirhan.fragmenttablayout.Adapter.CustomItemClickListener;
import com.kadirhan.fragmenttablayout.Adapter.RecyclerAdapter;
import com.kadirhan.fragmenttablayout.Model.Kisi;
import com.kadirhan.fragmenttablayout.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kadirhan on 18.06.2017.
 */

public class TabFragment1 extends Fragment {

    private RecyclerView recycler_view;
    private List<Kisi> kisi_list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_fragment_1, container, false);


        return rootView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }
}

