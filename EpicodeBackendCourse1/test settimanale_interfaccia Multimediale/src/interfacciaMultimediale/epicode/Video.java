package interfacciaMultimediale.epicode;

public class Video extends Audio implements Adjustable {

	private int brightness;
	private int duration;
	
	public Video(String title, int duration, int volume, int brightness) {
		super(title, duration, volume);
		this.brightness = brightness;
		this.duration = duration;
	}

	public void increaseBrightness() {
		brightness++;
	}

	public void decreaseBrightness() {
		brightness--;
	}

	@Override
	public void play() {
        for (int i = 0; i < duration; i++) {
            System.out.println(getTitle() + " " + repeat("!", duration));
            }
        for (int i = 0; i < brightness; i++) {
            System.out.println(getTitle() + " " + repeat("*", brightness));
        }
        
		
	}
    private String repeat(String s, int n) {
        return new String(new char[n]).replace("\0", s);
    }
}
