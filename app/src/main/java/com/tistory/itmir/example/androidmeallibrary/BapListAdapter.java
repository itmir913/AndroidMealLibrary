package com.tistory.itmir.example.androidmeallibrary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by whdghks913 on 2015-02-17.
 */
class BapViewHolder {
    public TextView mCalender;
    public TextView mDayOfTheWeek;
    public TextView mMorning;
    public TextView mLunch;
    public TextView mDinner;
}

class BapListData {
    public String mCalender;
    public String mDayOfTheWeek;
    public String mMorning;
    public String mLunch;
    public String mDinner;
}

public class BapListAdapter extends BaseAdapter {
    private Context mContext = null;
    private ArrayList<BapListData> mListData = new ArrayList<BapListData>();

    public BapListAdapter(Context mContext) {
        super();

        this.mContext = mContext;
    }

    public void addItem(String mCalender, String mDayOfTheWeek, String mMorning, String mLunch, String mDinner) {

        BapListData addItemInfo = new BapListData();
        addItemInfo.mCalender = mCalender;
        addItemInfo.mDayOfTheWeek = mDayOfTheWeek;
        addItemInfo.mMorning = mMorning;
        addItemInfo.mLunch = mLunch;
        addItemInfo.mDinner = mDinner;

        mListData.add(addItemInfo);
    }

    public void clearData() {
        mListData.clear();
    }

    @Override
    public int getCount() {
        return mListData.size();
    }

    @Override
    public BapListData getItem(int position) {
        return mListData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        BapViewHolder mHolder;

        if (convertView == null) {
            mHolder = new BapViewHolder();

            LayoutInflater inflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.row_bap_item, null);

            mHolder.mCalender = (TextView) convertView.findViewById(R.id.mCalender);
            mHolder.mDayOfTheWeek = (TextView) convertView.findViewById(R.id.mDayOfTheWeek);
            mHolder.mMorning = (TextView) convertView.findViewById(R.id.mMorning);
            mHolder.mLunch = (TextView) convertView.findViewById(R.id.mLunch);
            mHolder.mDinner = (TextView) convertView.findViewById(R.id.mDinner);

            convertView.setTag(mHolder);

        } else {
            mHolder = (BapViewHolder) convertView.getTag();
        }

        BapListData mData = mListData.get(position);

        String mCalender = mData.mCalender;
        String mDayOfTheWeek = mData.mDayOfTheWeek;
        String mMorning = mData.mMorning;
        String mLunch = mData.mLunch;
        String mDinner = mData.mDinner;

        /**
         * 급식이 없을경우 없다는 정보를 표시합니다.
         */
        /**
         * TODO 아침이 없습니다 부분은 개발자가 string.xml 파일에 <string> 정의하기 귀찮아서 하드코딩함.
         * TODO 여러분도 귀찮으면 걍 하드코딩 하세요. 유지 보수만 좀 힘듦
         */
        if (BapTool.mStringCheck(mMorning))
            mMorning = mData.mMorning = "아침이 없습니다.";
        if (BapTool.mStringCheck(mLunch))
            mLunch = mData.mLunch = mContext.getResources().getString(R.string.no_data_lunch);
        if (BapTool.mStringCheck(mDinner))
            mDinner = mData.mDinner = mContext.getResources().getString(R.string.no_data_dinner);

        mHolder.mCalender.setText(mCalender);
        mHolder.mDayOfTheWeek.setText(mDayOfTheWeek);
        mHolder.mMorning.setText(mMorning);
        mHolder.mLunch.setText(mLunch);
        mHolder.mDinner.setText(mDinner);

        return convertView;
    }
}
