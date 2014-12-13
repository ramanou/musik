package model;

import java.util.Set;

public abstract class AbstractArtist implements Commentable {

	private static final long serialVersionUID = 1L;

	private Set<Comment> comments;

	private Set<Music> musics;

	@Override
	public Set<Comment> getComments() {
		return comments;
	}

}
