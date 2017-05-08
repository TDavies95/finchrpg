package Code.FRPG;
public class Quest {
    private int questId, gpRwd, xpRwd, lvlRq;
    private String name, desc;
    public Quest(int QuestId){
        this.questId = questId;
        gpRwd = 0; // gold awarded at end of quest
        xpRwd = 0; // xp awarded at the end of the quest
        lvlRq = 0; //level requirement to start quest 
        name = ""; // name of the QUEST
        desc = ""; //description of the quest
    }
    public Quest(int questId, int gpRwd, int xpRwd, int lvlRq, String name, String desc){
        this.questId = questId; // ID of quest in case of reference maybe?
        this.gpRwd = gpRwd; // gold reward at end of quest
        this.xpRwd = xpRwd; // xp reward at end of quest
        this.lvlRq = lvlRq; // minimum level required to start quest
        this.name = name; // name of quest
        this.desc = desc; // description of quest
    }
    //public trigger(){ how do we create a trigger??
    //}
    //public goals(){  how do we create objectives?
    //}
    
    public void setQuestId(int questId){
        this.questId = questId;
    }
    public void setgpRwd(int gpRwd){
        this.gpRwd = gpRwd;
    }
    public void setxpRwd(int xpRwd){
        this.xpRwd = xpRwd;
    }
    public void setlvlRq(int lvlRq){
        this.lvlRq = lvlRq;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setdesc(String desc){
        this.desc = desc;
    }
    
    public int getQuestId(){
        return questId;
    }
    public int getgpRwd(){
        return gpRwd;
    }
    public int getxpRwd(){
        return xpRwd;
    }
    public int getlvlRq(){
        return lvlRq;
    }
    public String getname(){
        return name;
    }
    public String getdesc(){
        return desc;
    }

}