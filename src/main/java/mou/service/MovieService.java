package mou.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import mou.model.Movie;

@Service
public class MovieService {
	private static Map<String, Movie> dict_movies = new HashMap<>();
	static {
		Movie movie_0 = new Movie("1", "Incredible 2");
		dict_movies.put(movie_0.getId(), movie_0);

		Movie movie_1 = new Movie("2", "The Nutcracker And The Four Realms");
		dict_movies.put(movie_1.getId(), movie_1);

		Movie movie_2 = new Movie("3", "Toy Story 4");
		dict_movies.put(movie_2.getId(), movie_2);
	}

	public void createMovie(Movie m) {
		dict_movies.put(m.getId(), m);
	}

	public void updateMovie(String id, Movie m) {
		dict_movies.remove(id);
		m.setId(id);
		dict_movies.put(id, m);
	}

	public void deleteMovie(String id) {
		dict_movies.remove(id);

	}

	public Collection<Movie> getMovies() {
		return dict_movies.values();
	}
}