package rionbroome.com.leagueofheroes;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rbroome on 10/14/2016.
 */

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.ViewHolder> {

    public List<Hero> mData;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView HeroName;
        public TextView HeroDesc;
        public View layout;
        public ViewHolder(View v){
            super(v);
            HeroName = (TextView)v.findViewById(R.id.textHeroName);
            HeroDesc = (TextView)v.findViewById(R.id.textHeroDesc);
            layout = v;

        }
    }

    public HeroAdapter(List<Hero> myDataset) {
        mData = myDataset;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hero_row,parent,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.HeroName.setText(mData.get(position).Name);
        holder.HeroDesc.setText(mData.get(position).Desc);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


}
