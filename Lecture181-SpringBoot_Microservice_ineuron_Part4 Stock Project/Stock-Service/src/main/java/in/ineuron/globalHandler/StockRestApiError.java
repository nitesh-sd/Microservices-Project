package in.ineuron.globalHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.exception.StockNotFoundException;

@RestController
public class StockRestApiError {
	@ExceptionHandler(value = StockNotFoundException.class )
	public ResponseEntity<String> handleCOmpanyNotFoundException(StockNotFoundException se){
		return new ResponseEntity<String>(se.getMessage(),HttpStatus.BAD_REQUEST);
	}

}
