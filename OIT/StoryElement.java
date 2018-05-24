public class StoryElement{
    private int branch;
    private String story;
    
    public StoryElement(int branch, String story){
        this.branch = branch;
        this.story = story;
    }
    
    public int getBranch(){return this.branch;}
    public String getStory(){return this.story;}
}
