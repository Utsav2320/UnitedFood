package com.utsav.unitedfood.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.utsav.unitedfood.R;

public class ImageAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public ImageAdapter(Context context) {
        this.context = context;
    }

    int images[] = {
            R.drawable.food3,
            R.drawable.food2,
            R.drawable.deliveryman,
    };
    int heading[] = {
            R.string.first_Slide_Title,
            R.string.Second_Slide_Title,
            R.string.third_Slide_Title,
    };


    @Override
    public int getCount() {
        return heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (ConstraintLayout)object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((ConstraintLayout)object);



    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.foodmain,container,false);

        ImageView imageView=view.findViewById(R.id.slider_image);

        imageView.setImageResource(images[position]);

        container.addView(view);

        return view;
    }
}
