package GenshinManagementSystem.Model;

public class StatsCardModel {
    String title;
    String levelMaxed;
    String friendMaxed;
    String talentsMaxed;
    String teapotMaxed;
    String consMaxed;
    String percentage;
    
    public StatsCardModel(String title, String levelMaxed, String friendMaxed, String talentsMaxed, String teapotMaxed, String consMaxed, String percentage){
        this.title=title;
        this.levelMaxed=levelMaxed;
        this.friendMaxed=friendMaxed;
        this.talentsMaxed=talentsMaxed;
        this.teapotMaxed=teapotMaxed;
        this.consMaxed=consMaxed;
        this.percentage=percentage;
    }
}
