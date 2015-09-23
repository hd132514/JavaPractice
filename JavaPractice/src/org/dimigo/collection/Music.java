/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.collection
 * |_ Music
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 *
 * @author 	 : 김채린
 * @version  :1.0
 */
public class Music {
	
	private String title;
	private String singer;
	
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	
	public void setTitle(String title) {
		this.title = title;
	}

	
	public void setSinger(String singer) {
		this.singer = singer;
	}

	
	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	
	
	
	
	
}
