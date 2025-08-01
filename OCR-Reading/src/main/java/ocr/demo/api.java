package ocr.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class api {

    @Autowired testing testing;
    @GetMapping("/ocr")
    public ResponseEntity<?> ocr(){
       return new ResponseEntity<>(testing.ocrReadin(), HttpStatus.ACCEPTED);
  
    }

}
