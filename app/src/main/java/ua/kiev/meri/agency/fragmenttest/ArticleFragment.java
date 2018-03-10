package ua.kiev.meri.agency.fragmenttest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;

/**
 * Created by mary on 10/03/18.
 */

public class ArticleFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.article_view, container, false);
    }

}
