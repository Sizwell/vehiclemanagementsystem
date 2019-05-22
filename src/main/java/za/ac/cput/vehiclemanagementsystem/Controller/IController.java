package za.ac.cput.vehiclemanagementsystem.Controller;

import org.springframework.web.bind.annotation.GetMapping;
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
}
