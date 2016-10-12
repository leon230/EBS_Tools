//package com.ebs.test;
//
//import com.ebs.Controller.FileUploadController;
//import com.ebs.Controller.FileValidateController;
//import com.ebs.storage.StorageService;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
//
///**
// * Created by lukasz.homik on 2016-10-12.
// */
//
//public class FileUploadTest {
//    private MockMvc mockMvc;
//
//    @Before
//    public void setup() {
//        this.mockMvc = standaloneSetup(new FileUploadController(StorageService storageService)).build();
//    }
//
//    @Test
//    public void testTicketHomePage() throws Exception {
//        FileValidateController tc = new FileValidateController();
//        MockMvc mockMvc = standaloneSetup(tc).build();
//
//        mockMvc.perform(get("/")).andExpect(view().name("home"));
//    }
//}
