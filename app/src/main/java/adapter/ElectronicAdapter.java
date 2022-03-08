package adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;

import java.util.List;

import model.Electronic;

public class ElectronicAdapter extends BaseAdapter {

    private Context context;
    private int idLayout;
    private List<Electronic> listElectronic;
    private int positionSelected = -1;

    // Constructor
    public ElectronicAdapter(Context context, int idLayout, List<Electronic> listElectronic) {
        this.context = context;
        this.idLayout = idLayout;
        this.listElectronic = listElectronic;
    }

    @Override
    public int getCount() {
        if(!listElectronic.isEmpty() && listElectronic.size() != 0) {
            return listElectronic.size();
        }

        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(idLayout, viewGroup, false);
        }

        TextView tvDescription = view.findViewById(R.id.tvDescription);
        TextView tvPrice = view.findViewById(R.id.tvPrice);
        TextView tvDiscount = view.findViewById(R.id.tvDiscount);
        ImageView imgElectronic = view.findViewById(R.id.imgElectronic);
        ImageView imgStar1 = view.findViewById(R.id.imgStar1);
        ImageView imgStar2 = view.findViewById(R.id.imgStar2);
        ImageView imgStar3 = view.findViewById(R.id.imgStar3);
        ImageView imgStar4 = view.findViewById(R.id.imgStar4);
        ImageView imgStar5 = view.findViewById(R.id.imgStar5);
        final LinearLayout linearLayout = view.findViewById(R.id.idLinearLayout);
        final Electronic electronic = listElectronic.get(i);

        if(!listElectronic.isEmpty() && listElectronic != null) {
            tvDescription.setText(electronic.getDescription());
            tvPrice.setText(electronic.getPrice());
            tvDiscount.setText(electronic.getDiscount());
            int idElectronic = electronic.getId();
            switch (idElectronic) {
                case 1:
                    imgElectronic.setImageResource(R.drawable.giacchuyen1);
                    imgStar1.setImageResource(R.drawable.star1);
                    imgStar2.setImageResource(R.drawable.star1);
                    imgStar3.setImageResource(R.drawable.star1);
                    imgStar4.setImageResource(R.drawable.star1);
                    imgStar5.setImageResource(R.drawable.star5);
                    break;
                case 2:
                    imgElectronic.setImageResource(R.drawable.daynguon2);
                    imgStar1.setImageResource(R.drawable.star1);
                    imgStar2.setImageResource(R.drawable.star1);
                    imgStar3.setImageResource(R.drawable.star1);
                    imgStar4.setImageResource(R.drawable.star1);
                    imgStar5.setImageResource(R.drawable.star5);
                    break;
                case 3:
                    imgElectronic.setImageResource(R.drawable.dauchuyendoipsps3);
                    imgStar1.setImageResource(R.drawable.star1);
                    imgStar2.setImageResource(R.drawable.star1);
                    imgStar3.setImageResource(R.drawable.star1);
                    imgStar4.setImageResource(R.drawable.star1);
                    imgStar5.setImageResource(R.drawable.star5);
                    break;
                case 4:
                    imgElectronic.setImageResource(R.drawable.dauchuyendoi4);
                    imgStar1.setImageResource(R.drawable.star1);
                    imgStar2.setImageResource(R.drawable.star1);
                    imgStar3.setImageResource(R.drawable.star1);
                    imgStar4.setImageResource(R.drawable.star1);
                    imgStar5.setImageResource(R.drawable.star5);
                    break;
                case 5:
                    imgElectronic.setImageResource(R.drawable.carbusbtops5);
                    imgStar1.setImageResource(R.drawable.star1);
                    imgStar2.setImageResource(R.drawable.star1);
                    imgStar3.setImageResource(R.drawable.star1);
                    imgStar4.setImageResource(R.drawable.star1);
                    imgStar5.setImageResource(R.drawable.star5);
                    break;
                case 6:
                    imgElectronic.setImageResource(R.drawable.daucam6);
                    imgStar1.setImageResource(R.drawable.star1);
                    imgStar2.setImageResource(R.drawable.star1);
                    imgStar3.setImageResource(R.drawable.star1);
                    imgStar4.setImageResource(R.drawable.star1);
                    imgStar5.setImageResource(R.drawable.star5);
                    break;
                default:
                    break;
            }
        }

        // Click
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, electronic.getDescription(), Toast.LENGTH_SHORT).show();
                positionSelected = i;
                notifyDataSetChanged();
            }
        });

        if(positionSelected == i) {
            linearLayout.setBackgroundColor(Color.rgb(213, 213, 213));
        } else {
            linearLayout.setBackgroundColor(Color.WHITE);
        }

        return view;
    }
}
