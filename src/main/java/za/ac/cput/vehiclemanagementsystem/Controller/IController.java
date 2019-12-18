package za.ac.cput.vehiclemanagementsystem.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IController
{
    @GetMapping("/")
    @ResponseBody

    public String getHome()
    {
        return "Home Run!!!";
    }

    @RequestMapping(value = {"/", "/vehicles/create"})
    public ResponseEntity <String> home()
    {
        return new ResponseEntity<>("Welcome to the Cape Vehicle Management App!", HttpStatus.OK);
    }

}
