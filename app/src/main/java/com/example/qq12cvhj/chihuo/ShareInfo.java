package com.example.qq12cvhj.chihuo;

import android.annotation.SuppressLint;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by qq12cvhj on 2018/4/10.
 */

public class ShareInfo {
    public int shareId;
    public String shareTitle;
    public String shareAuthor;
    public String shareTitleImg;
    public String pubTimeStr;
    public Date pubDate;
    //@SuppressLint("SimpleDateFormat")
    //public SimpleDateFormat sdft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
    //public String pubTimeStr = sdft.format(pubDate);

    public ShareInfo(int shareId, String shareTitle, String shareAuthor, String pubTimeStr) {
        this.shareId = shareId;
        this.shareTitle = shareTitle;
        this.shareAuthor = shareAuthor;
        this.pubTimeStr = pubTimeStr;
        //默认先置空
        this.shareTitleImg = null;
    }
}
