package interfacciaMultimediale.epicode;

public class Image extends MediaElement implements Visible, Adjustable {
	
	private int brightness;

	public Image(String title, int brightness) {
		super(title);
		this.brightness = brightness;
	}

	@Override
	public void show() {
        for (int i = 0; i < brightness; i++) {
            System.out.println(getTitle() + " " + repeat("*", brightness));
        }
	}

	 private String repeat(String s, int n) {
	        return new String(new char[n]).replace("\0", s);
	    }
	@Override
	public void increaseBrightness() {
		brightness++;
	}

	@Override
	public void decreaseBrightness() {
		brightness--;
	}
}
