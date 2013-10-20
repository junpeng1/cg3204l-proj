import model.Image;
import model.Link;

/**
 * 
 * Analyzer class for analyzing
 * text relevance
 *
 */
public class Analyzer {
	
	public Analyzer() {
		
	}

	public boolean checkRelevance(Image image, String keyword) {
		String text = image.getAlt() + " "
				+ image.getCaption() + " "
				+ image.getFilename();
		
		// naive implementation
		if (text.contains(keyword)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkRelevance(Link link, String keyword) {
		String text = link.getHref() + " "
				+ link.getText();
		
		// naive implementation
		if (text.contains(keyword)) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
