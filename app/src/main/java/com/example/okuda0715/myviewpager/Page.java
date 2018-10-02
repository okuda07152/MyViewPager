package com.example.okuda0715.myviewpager;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class Page extends Fragment {

    private static final String BACKGROUND_COLOR = "background_color";

    // Fragmentはコンストラクタでパラメータを渡さない。Bundleで渡す。
    public static Page newInstance(int resId) {
        Page page = new Page();
        Bundle bundle = new Bundle();
        bundle.putInt(BACKGROUND_COLOR, resId);
        page.setArguments(bundle);
        return page;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        // 通常のFragmentのinflate()では、第二引数にcontainerを指定するが、ViewPagerはnull（でいいのか？）を指定する。
        View view = inflater.inflate(R.layout.page, null, false);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.page);
        linearLayout.setBackgroundResource(getArguments().getInt(BACKGROUND_COLOR));

        return view;
    }
}
