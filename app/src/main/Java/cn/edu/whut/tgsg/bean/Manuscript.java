package cn.edu.whut.tgsg.bean;

import java.io.Serializable;

/**
 * 稿件
 * <p/>
 * Created by xwh on 2015/12/3.
 */
public class Manuscript implements Serializable {

    /**
     * 编号 : 1
     * 类别 : 随笔
     * 投稿人 : 当前用户
     * 投稿时间 : 2015-12-11 10:35:10
     * 状态 : 1-6
     * // 最新版本 : ManuscriptVersion
     */

    int id;
    int type;
    User contributor;
    String contributeTime;
    int state;
    //ManuscriptVersion manuscriptVersion;

    public Manuscript() {
    }

    public Manuscript(int id, int type, User contributor, String contributeTime, int state) {
        this.id = id;
        this.type = type;
        this.contributor = contributor;
        this.contributeTime = contributeTime;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public User getContributor() {
        return contributor;
    }

    public void setContributor(User contributor) {
        this.contributor = contributor;
    }

    public String getContributeTime() {
        return contributeTime;
    }

    public void setContributeTime(String contributeTime) {
        this.contributeTime = contributeTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
