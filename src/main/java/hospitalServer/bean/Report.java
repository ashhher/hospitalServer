package hospitalServer.bean;

/**
 * @author: create by XiaoHan
 * @version: v1.0
 * @description: hospitalServer.bean
 * @date:2020/4/26
 **/
public class Report {
    private int rptId;
    private String userId;
    private String rptContent;

    public Report() {
    }

    public Report(int rptId, String userId, String rptContent) {
        this.rptId = rptId;
        this.userId = userId;
        this.rptContent = rptContent;
    }

    public int getRptId() {
        return rptId;
    }

    @Override
    public String toString() {
        return "Report{" +
                "rptId=" + rptId +
                ", userId='" + userId + '\'' +
                ", rptContent='" + rptContent + '\'' +
                '}';
    }

    public void setRptId(int rptId) {
        this.rptId = rptId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRptContent() {
        return rptContent;
    }

    public void setRptContent(String rptContent) {
        this.rptContent = rptContent;
    }
}