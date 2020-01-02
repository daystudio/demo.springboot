package mou;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mou.model.Movie;
import mou.service.MovieService;


@RestController
public class MovieController {
	@Autowired
	MovieService serv_movie;

	@RequestMapping(value = "/")
	public ResponseEntity<Object> home() {
		return new ResponseEntity<>("success", HttpStatus.OK);
	}

	@RequestMapping(value = "/movie")
	public ResponseEntity<Object> getMovie() {
		return new ResponseEntity<>(serv_movie.getMovies(), HttpStatus.OK);
	}

	@RequestMapping(value = "/movie/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Object> updateMovie(@PathVariable("id") String id, @RequestBody Movie m) {
		serv_movie.updateMovie(id, m);
		return new ResponseEntity<>("Movie is updated successsfully", HttpStatus.OK);
	}

	@RequestMapping(value = "/movie/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> delete(@PathVariable("id") String id) {
		serv_movie.deleteMovie(id);
		return new ResponseEntity<>("Movie is deleted successsfully", HttpStatus.OK);
	}

	@RequestMapping(value = "/movie", method = RequestMethod.POST)
	public ResponseEntity<Object> createMovie(@RequestBody Movie m) {
		serv_movie.createMovie(m);
		return new ResponseEntity<>("Movie is created successfully", HttpStatus.CREATED);
	}
}