package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia_kelompok3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Rehan on 11/13/2016.
 */

class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    //deklarasi variable context

    private final Context context;

    String[] name = {"Sumatra", "Kalimantan", "Sulawesi", "Jawa",
            "Papua"};
    String[] desc = {"20 Wisata", "10 Wisata", "11 Wisata", "10 Wisata", "10 Wisata"};
    String[] img = {"@drawable/a1", "@drawable/a2", "@drawable/a3", "@drawable/a4", "@drawable/a5"};
    // menampilkan list item dalam bentuk text dengan tipe data string dengan variable name

    LayoutInflater inflater;
    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //member aksi saat cardview diklik berdasarkan posisi tertentu
            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();
            int position = vholder.getPosition();
            if (position == 0 && position < getItemCount()) {
                Intent intent = new Intent(context, ActivitySumatra.class);
                context.startActivity(intent);
            }
            if (position == 1 && position < getItemCount()) {
                Intent intent = new Intent(context, KalimantanActivity.class);
                context.startActivity(intent);
            }
        }
    };

    public RecyclerAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_list, parent, false);
        RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.tv1.setText(name[position]);
        holder.tv1.setOnClickListener(clickListener);
        holder.tv1.setTag(holder);
        holder.tv2.setText(desc[position]);
        holder.imageView.setOnClickListener(clickListener);
        holder.imageView.setTag(holder);

    }

    @Override
    public int getItemCount() {
        return name.length;
    }
}
