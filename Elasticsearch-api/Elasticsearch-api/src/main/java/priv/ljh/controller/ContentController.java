package priv.ljh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import priv.ljh.service.ContentService;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
public class ContentController {
    @Autowired
    private ContentService contentService;

    @ResponseBody
    @GetMapping("/parse/{keyword}")
    public Boolean parse(@PathVariable("keyword") String keyword) throws IOException {
        return contentService.parseContent(keyword);
    }
    @ResponseBody
    @GetMapping("/search/{keyword}/{pageIndex}/{pageSize}")
    public List<Map<String, Object>> parse(@PathVariable("keyword") String keyword,
                                           @PathVariable("pageIndex") Integer pageIndex,
                                           @PathVariable("pageSize") Integer pageSize) throws IOException {
        return contentService.search(keyword,pageIndex,pageSize);
    }

    @ResponseBody
    @GetMapping("/h_search/{keyword}/{pageIndex}/{pageSize}")
    public List<Map<String, Object>> highlightParse(@PathVariable("keyword") String keyword,
                                                    @PathVariable("pageIndex") Integer pageIndex,
                                                    @PathVariable("pageSize") Integer pageSize) throws IOException {
        return contentService.highlightSearch(keyword,pageIndex,pageSize);
    }
}