package sep.via.dk.sep3JPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sep.via.dk.sep3JPA.domain.FeedBack;
import sep.via.dk.sep3JPA.service.feedBackServic.FeedBackService;
@RestController
@RequestMapping("/sep3")
public class FeedBackController {
	
	@Autowired
	 FeedBackService  FeedBackService;

	
	@PostMapping("/feedBack")
	public ResponseEntity<Void> addFeedBack(@RequestBody FeedBack feedBack) {
		
		FeedBackService.addFeedBack(feedBack);
		
		HttpHeaders headers = new HttpHeaders();

		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
}
	@GetMapping("/feedBack")
	public ResponseEntity<List<FeedBack>> getAllMovies()  {
		
		List<FeedBack> list = FeedBackService.getAllFeedBack();
		return new ResponseEntity<List<FeedBack>>(list, HttpStatus.OK);
		
		
		
		
		
	}
}