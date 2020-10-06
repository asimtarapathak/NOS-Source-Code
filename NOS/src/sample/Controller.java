package sample;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.awt.*;
import java.net.URI;

public class Controller{

    ObservableList<String>class1CourseList = FXCollections.observableArrayList("Class 1","Computer Science","Science");
    ObservableList<String>class2CourseList = FXCollections.observableArrayList("Class 2","Computer Science","Science","Social Studies");
    ObservableList<String>class3CourseList = FXCollections.observableArrayList("Class 3","Social Studies","Science","Computer Science","Mathematics","Science Health","Physical Education","Mero Nepali");
    ObservableList<String>class4CourseList = FXCollections.observableArrayList("Class 4","Science","Computer Science","Mathematics");
    ObservableList<String>class5CourseList = FXCollections.observableArrayList("Class 5","Nepali","Mathematics","Health and Physical Education","Computer Science","Science","QBASIC");
    ObservableList<String>class6CourseList = FXCollections.observableArrayList("Class 6","Science - Nepali Medium","Science","Computer Science","Mathematics","Maths- Solution","OBTE","Health and Physical","QBASIC");
    ObservableList<String>class7CourseList = FXCollections.observableArrayList("Class 7","Science","Science- Nepali Medium","Computer Science","Social Studies","Mathematics - 1","Mathematics - 2","Mathematics - 3","Mathematics - 4","Mathematics - 5","QBASIC");
    ObservableList<String>class8CourseList = FXCollections.observableArrayList("Class 8 - BLE","Science","Optional Mathematics","Computer Science","Compulsory Mathematics","English","Social Studies","Accounting","Science- Nepali Medium","Maths Past questions","QBASIC");
    ObservableList<String>class9CourseList = FXCollections.observableArrayList("Class 9","Science - 1","Science - 2","Science - Biology","Compulsory Mathematics- 1","Compulsory Mathematics- 2","Parallelogram","Accounting - 1","Accounting - 2","Computer Science-1","Computer Science-2","Computer Science-3","Optional Mathematics","EPH","Economics","QBASIC");
    ObservableList<String>class10CourseList = FXCollections.observableArrayList("Class 10","Computer Science-1","Computer Science-2","Optional Mathematics","Compulsory Mathematics- 1","Compulsory Mathematics- 2","Science - 1","Science - 2","Science - 3","Science - 4","Science - 5","Science - 6","Accounting - 1","Accounting - 2","English - 1","English - 2","EPH","QBASIC","10 Set Solution");
    ObservableList<String>management11List = FXCollections.observableArrayList("Management- 11","Link English","Magic of Words","Meaning into Words","Computer Science-1","Computer Science-2","Mathematics-1","Mathematics-2","Mathematics-3","Mathematics-4","Mathematics-5","Economics","Business Studies","Accounting");
    ObservableList<String>science11List = FXCollections.observableArrayList("Science- 11","Link English","Magic of Words","Meaning into Words","Computer Science-1","Computer Science-2","Mathematics-1","Mathematics-2","Mathematics-3","Mathematics-4","Mathematics-5","Physics -1","Physics -2","Biology-Botany","Biology-Zoology","Chemistry");
    ObservableList<String>management12List = FXCollections.observableArrayList("Management- 12","Computer Science-1","Computer Science-2","C Programming","Mathematics-1","Mathematics-2","Business Studies","Marketing","Business Maths","Account-1","Account-2","Account-3","Business Organization");
    ObservableList<String>science12List = FXCollections.observableArrayList("Science- 12","Mathematics-1","Mathematics-2","Chemistry","Physics","Botany");
    ObservableList<String>csitList = FXCollections.observableArrayList("CSIT","Information Technology","Internet Technology","Physics","Digital Logic","C Programming");
    ObservableList<String>bcaList = FXCollections.observableArrayList("BCA","Information System","Internet Technology","Digital Logic","Maths","Statistic","C Programming");
    ObservableList<String>bimList = FXCollections.observableArrayList("BIM","Information System","Information Management","Digital Logic","Maths","C Programming");
    ObservableList<String>bbabbsList = FXCollections.observableArrayList("BBA/BBS","Statistic-1","Statistic-2","Statistic-3","Index Numbers","Correlation","Skewness,Kurtosis","Probability","Poisson Distribution","Regression Analysis","Presentation of Data");


    @FXML
    public WebView webView;

    @FXML
    public ChoiceBox class1Course;
    public ChoiceBox class2Course;
    public ChoiceBox class3Course;
    public ChoiceBox class4Course;
    public ChoiceBox class5Course;
    public ChoiceBox class6Course;
    public ChoiceBox class7Course;
    public ChoiceBox class8Course;
    public ChoiceBox class9Course;
    public ChoiceBox class10Course;
    public ChoiceBox management11;
    public ChoiceBox science11;
    public ChoiceBox management12;
    public ChoiceBox science12;
    public ChoiceBox csit;
    public ChoiceBox bca;
    public ChoiceBox bim;
    public ChoiceBox bbabbs;

    @FXML
    public void initialize(){

        class1Course.setValue("Class 1");
        class1Course.setItems(class1CourseList);

        class2Course.setValue("Class 2");
        class2Course.setItems(class2CourseList);

        class3Course.setValue("Class 3");
        class3Course.setItems(class3CourseList);

        class4Course.setValue("Class 4");
        class4Course.setItems(class4CourseList);

        class5Course.setValue("Class 5");
        class5Course.setItems(class5CourseList);

        class6Course.setValue("Class 6");
        class6Course.setItems(class6CourseList);

        class7Course.setValue("Class 7");
        class7Course.setItems(class7CourseList);

        class8Course.setValue("Class 8 - BLE");
        class8Course.setItems(class8CourseList);

        class9Course.setValue("Class 9");
        class9Course.setItems(class9CourseList);

        class10Course.setValue("Class 10 - SEE");
        class10Course.setItems(class10CourseList);

        management11.setValue("Management 11");
        management11.setItems(management11List);

        science11.setValue("Science 11");
        science11.setItems(science11List);

        management12.setValue("Management 12");
        management12.setItems(management12List);

        science12.setValue("Science 12");
        science12.setItems(science12List);

        csit.setValue("CSIT");
        csit.setItems(csitList);

        bca.setValue("BCA");
        bca.setItems(bcaList);

        bim.setValue("BIM");
        bim.setItems(bimList);

        bbabbs.setValue("BBA/BBS");
        bbabbs.setItems(bbabbsList);

    }

    @FXML
    public void loadHomepage(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/channel/UClDw4ijXzb9YxiU5nWinEfQ");

    }

    @FXML
    public void loadWebsite(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.nepalonlineschool.org/");

    }

    @FXML
    public void browseLKGUKG(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=vPMUF-dXzfM&list=PLztdBcd3--U2ObI20oxHI-0ExZ06A2A0y");

    }

    @FXML
    public void selectClass1(MouseEvent mouseEvent){

        class2Course.setValue("Class 2");
        class3Course.setValue("Class 3");
        class4Course.setValue("Class 4");
        class5Course.setValue("Class 5");
        class6Course.setValue("Class 6");
        class7Course.setValue("Class 7");
        class8Course.setValue("Class 8 - BLE");
        class9Course.setValue("Class 9");
        class10Course.setValue("Class 10 - SEE");
        management11.setValue("Management 11");
        science11.setValue("Science 11");
        management12.setValue("Management 12");
        science12.setValue("Science 12");
        csit.setValue("CSIT");
        bca.setValue("BCA");
        bim.setValue("BIM");
        bbabbs.setValue("BBA/BBS");
        String s = class1Course.getSelectionModel().getSelectedItem().toString();

        if(s == "Computer Science") {
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=aQuEbMAHciE&list=PLztdBcd3--U1a5Fn39NCcvHByh88Fl3lA");
        }

        if(s == "Science"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=XzzxDcKjhyA&list=PLztdBcd3--U00ag62vGvqbu49O69JpzqV");
        }

    }

    @FXML
    public void selectClass2(MouseEvent mouseEvent){

        class1Course.setValue("Class 1");
        class3Course.setValue("Class 3");
        class4Course.setValue("Class 4");
        class5Course.setValue("Class 5");
        class6Course.setValue("Class 6");
        class7Course.setValue("Class 7");
        class8Course.setValue("Class 8 - BLE");
        class9Course.setValue("Class 9");
        class10Course.setValue("Class 10 - SEE");
        management11.setValue("Management 11");
        science11.setValue("Science 11");
        management12.setValue("Management 12");
        science12.setValue("Science 12");
        csit.setValue("CSIT");
        bca.setValue("BCA");
        bim.setValue("BIM");
        bbabbs.setValue("BBA/BBS");
        String s = class2Course.getSelectionModel().getSelectedItem().toString();

        if(s == "Computer Science") {
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=KGB6u7SeX7k&list=PLztdBcd3--U2ryvckhQ335WbojStplG-m");
        }

        if(s == "Science"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=7Ovxb1ebSck&list=PLztdBcd3--U267QOH1eVKQ-r6SSrBeZZP");
        }

        if(s == "Social Studies"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=-reKr7WZx1A&list=PLztdBcd3--U1mGummchbVizlNLwoVAe1v");
        }

    }

    @FXML
    public void selectClass3(MouseEvent mouseEvent){

        class1Course.setValue("Class 1");
        class2Course.setValue("Class 2");
        class4Course.setValue("Class 4");
        class5Course.setValue("Class 5");
        class6Course.setValue("Class 6");
        class7Course.setValue("Class 7");
        class8Course.setValue("Class 8 - BLE");
        class9Course.setValue("Class 9");
        class10Course.setValue("Class 10 - SEE");
        management11.setValue("Management 11");
        science11.setValue("Science 11");
        management12.setValue("Management 12");
        science12.setValue("Science 12");
        csit.setValue("CSIT");
        bca.setValue("BCA");
        bim.setValue("BIM");
        bbabbs.setValue("BBA/BBS");
        String s = class3Course.getSelectionModel().getSelectedItem().toString();

        if(s == "Social Studies") {
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=ubt2vPxMgSo&list=PLztdBcd3--U05i9OMAhemn3UVeSriWz3-");
        }

        if(s == "Science"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=m5fc7Y9toLc&list=PLztdBcd3--U3-geSwmGTWJDBY7V7Gu-hd");
        }

        if(s == "Computer Science"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=bNSB80V6Awg&list=PLztdBcd3--U2wp_OuIIt8jrdd9lc_GyPm");
        }

        if(s == "Mathematics"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=kGXgRGkoHic&list=PLztdBcd3--U2-zGyk8n-Ex-brX2_EKBjI");
        }

        if(s == "Science Health"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=z0JWJ40SIHI&list=PLztdBcd3--U2AEGeOtFc0wXFY19xt0xZc");
        }

        if(s == "Physical Education"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=SbTErncy8PU&list=PLztdBcd3--U3gZ7r_CMbDBJSyl9kGRg29");
        }

        if(s == "Mero Nepali"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=81JNGQiz_tw&list=PLztdBcd3--U18sbRNAbt-3osbbwTIeN7f");
        }

    }

    @FXML
    public void selectClass4(MouseEvent mouseEvent){

        class1Course.setValue("Class 1");
        class2Course.setValue("Class 2");
        class3Course.setValue("Class 3");
        class5Course.setValue("Class 5");
        class6Course.setValue("Class 6");
        class7Course.setValue("Class 7");
        class8Course.setValue("Class 8 - BLE");
        class9Course.setValue("Class 9");
        class10Course.setValue("Class 10 - SEE");
        management11.setValue("Management 11");
        science11.setValue("Science 11");
        management12.setValue("Management 12");
        science12.setValue("Science 12");
        csit.setValue("CSIT");
        bca.setValue("BCA");
        bim.setValue("BIM");
        bbabbs.setValue("BBA/BBS");
        String s = class4Course.getSelectionModel().getSelectedItem().toString();

        if(s == "Science"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=9CQJ-RLC92Y&list=PLztdBcd3--U1qWMHy4EkKC673A8l8wrAJ");
        }

        if(s == "Computer Science"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=syXyf-grbMg&list=PLztdBcd3--U3xEefMIbVUbAafDhWcf3a0");
        }

        if(s == "Mathematics"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=pCvIs4xjnac&list=PLztdBcd3--U1ANrJI-ibDw2m0Jz1a8Vte");
        }

    }

    @FXML
    public void selectClass5(MouseEvent mouseEvent){

        class1Course.setValue("Class 1");
        class2Course.setValue("Class 2");
        class3Course.setValue("Class 3");
        class4Course.setValue("Class 4");
        class6Course.setValue("Class 6");
        class7Course.setValue("Class 7");
        class8Course.setValue("Class 8 - BLE");
        class9Course.setValue("Class 9");
        class10Course.setValue("Class 10 - SEE");
        management11.setValue("Management 11");
        science11.setValue("Science 11");
        management12.setValue("Management 12");
        science12.setValue("Science 12");
        csit.setValue("CSIT");
        bca.setValue("BCA");
        bim.setValue("BIM");
        bbabbs.setValue("BBA/BBS");
        String s = class5Course.getSelectionModel().getSelectedItem().toString();

        if(s == "Nepali"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=8UzRfbCJCMI&list=PLztdBcd3--U0TZkis8vonh9-rPolzInLG");
        }

        if(s == "Mathematics"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=QABVPcAv-nI&list=PLztdBcd3--U0spX88i6SDh_Nvr83CcIYM");
        }

        if(s == "Health and Physical Education"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=HWNqwh1cNGU&list=PLztdBcd3--U2rp7gppb_sg7-K64St1bJr");
        }

        if(s == "Computer Science"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=qWGAdrgWHHQ&list=PLztdBcd3--U3Qv7DlzoHvyABkQIqdfuZo");
        }

        if(s == "Science"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=PkcUglpGLDY&list=PLztdBcd3--U1zh7VsWbBP8PpvFsvkLJ06");
        }

        if(s == "QBASIC"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=BBB0PFLZ1d8&list=PLztdBcd3--U1PR2SBJpdhnCxs50Ta7mr_");
        }

    }

    @FXML
    public void selectClass6(MouseEvent mouseEvent){

        class1Course.setValue("Class 1");
        class2Course.setValue("Class 2");
        class3Course.setValue("Class 3");
        class4Course.setValue("Class 4");
        class5Course.setValue("Class 5");
        class7Course.setValue("Class 7");
        class8Course.setValue("Class 8 - BLE");
        class9Course.setValue("Class 9");
        class10Course.setValue("Class 10 - SEE");
        management11.setValue("Management 11");
        science11.setValue("Science 11");
        management12.setValue("Management 12");
        science12.setValue("Science 12");
        csit.setValue("CSIT");
        bca.setValue("BCA");
        bim.setValue("BIM");
        bbabbs.setValue("BBA/BBS");
        String s = class6Course.getSelectionModel().getSelectedItem().toString();

        if(s == "Science - Nepali Medium"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=lh9rY36901I&list=PLztdBcd3--U0WzDv40kKRf6KyM5wvL8ib");
        }

        if(s == "Science"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=YfQ_o_0zZ_Q&list=PLztdBcd3--U2hhDVDOmcOr9FByS78o8FA");
        }

        if(s == "Computer Science"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=NAD99XpO9w8&list=PLztdBcd3--U1f-5zSze1C21L8MVX6wN0k");
        }

        if(s == "Mathematics"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=nFwYgT3zrJo&list=PLztdBcd3--U37rC10JBnDvPtNaMX9Dgnl");
        }

        if(s == "Maths- Solution"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=Ca3IpzKEbRs&list=PLztdBcd3--U1aWCyML7IGMg3Mymg51A3I");
        }

        if(s == "OBTE"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=p-_ZFYCfnoo&list=PLztdBcd3--U1PtF_YGWnJIs7CJ02aVkjC");
        }

        if(s == "Health and Physical"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=6sLxna__Wf0&list=PLztdBcd3--U3kbhIVV1Ts3HJFXwBLZeRE");
        }

        if(s == "QBASIC"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=BBB0PFLZ1d8&list=PLztdBcd3--U1PR2SBJpdhnCxs50Ta7mr_");
        }

    }

    @FXML
    public void selectClass7(MouseEvent mouseEvent){

        class1Course.setValue("Class 1");
        class2Course.setValue("Class 2");
        class3Course.setValue("Class 3");
        class4Course.setValue("Class 4");
        class5Course.setValue("Class 5");
        class6Course.setValue("Class 6");
        class8Course.setValue("Class 8 - BLE");
        class9Course.setValue("Class 9");
        class10Course.setValue("Class 10 - SEE");
        management11.setValue("Management 11");
        science11.setValue("Science 11");
        management12.setValue("Management 12");
        science12.setValue("Science 12");
        csit.setValue("CSIT");
        bca.setValue("BCA");
        bim.setValue("BIM");
        bbabbs.setValue("BBA/BBS");
        String s = class7Course.getSelectionModel().getSelectedItem().toString();

        if(s == "Science- Nepali Medium"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=6qaAjkm3f_Y&list=PLztdBcd3--U1X_iSkco63c85-54cGa9oo");
        }

        if(s == "Science"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=iN6Om5HaKJc&list=PLztdBcd3--U0iIGCosEKIcEPzT7LZXx3a");
        }

        if(s == "Computer Science"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=9m97zKhrQ2s&list=PLztdBcd3--U0DaYY-eszAeKTE08w-AqNI");
        }

        if(s == "Social Studies"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=0hds_ph9O-c&list=PLztdBcd3--U2poaJ-iTVDiJ4nivWWF9Fl");
        }

        if(s == "Mathematics - 1"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=8AaMmz12Et0&list=PLztdBcd3--U19Brp06DyPXWe_LqI58Rrc");
        }

        if(s == "Mathematics - 2"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=Vb0Pn39B8XA&list=PLztdBcd3--U0Uot3ba4KISgh54P-dKtN7");
        }

        if(s == "Mathematics - 3"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=54geQG7Bj7c&list=PLztdBcd3--U1N1EbKgXv4C7MjH4nFwy0L");
        }

        if(s == "Mathematics - 4"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=SgBjXN6fpt8&list=PLztdBcd3--U2oa_ITgZnSWnu1H-xDaJCD");
        }

        if(s == "Mathematics - 5"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=lf72m1Xoy-c&list=PLztdBcd3--U0ERSC7YpCkXhTTN6lc1w4s");
        }

        if(s == "QBASIC"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=BBB0PFLZ1d8&list=PLztdBcd3--U1PR2SBJpdhnCxs50Ta7mr_");
        }

    }

    @FXML
    public void selectClass8(MouseEvent mouseEvent){

        class1Course.setValue("Class 1");
        class2Course.setValue("Class 2");
        class3Course.setValue("Class 3");
        class4Course.setValue("Class 4");
        class5Course.setValue("Class 5");
        class6Course.setValue("Class 6");
        class7Course.setValue("Class 7");
        class9Course.setValue("Class 9");
        class10Course.setValue("Class 10 - SEE");
        management11.setValue("Management 11");
        science11.setValue("Science 11");
        management12.setValue("Management 12");
        science12.setValue("Science 12");
        csit.setValue("CSIT");
        bca.setValue("BCA");
        bim.setValue("BIM");
        bbabbs.setValue("BBA/BBS");
        String s = class8Course.getSelectionModel().getSelectedItem().toString();

        if(s == "Science- Nepali Medium"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=_rfKcL2hBV4&list=PLztdBcd3--U2Z5fZHl8Xh8xXsotVjL28r");
        }

        if(s == "Science"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=O2Ads0EH42A&list=PLztdBcd3--U2FOLHpUe7U14MbPKM_iqHO");
        }

        if(s == "Computer Science"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=LJkRErkRW6s&list=PLztdBcd3--U23JqlnkS1XF5ucPuQxl2Cm");
        }

        if(s == "Social Studies"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=P6_vatUzuLQ&list=PLztdBcd3--U16GmHwqVi7pignTemJCTDa");
        }

        if(s == "Optional Mathematics"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=4TYeXY42_hs&list=PLztdBcd3--U1ZJw7ovD-7VNs6CoSybR-6");
        }

        if(s == "Compulsory Mathematics"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=0p9i-JyLPEc&list=PLztdBcd3--U0NdAmw8y3KNbCWpsXMD-er");
        }

        if(s == "Maths Past questions"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=vwneoOEPqB4&list=PLztdBcd3--U0Lyl7xUYQPP9TtdAuQtyrt");
        }

        if(s == "English"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=KzMNhilYCrE&list=PLztdBcd3--U0sZT05hXt34uEqKczGUvgR");
        }

        if(s == "Accounting"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=cah1iXcF92Y&list=PLztdBcd3--U2nXHS8eJQ9o8G7fM-Yi5oY");
        }

        if(s == "QBASIC"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=BBB0PFLZ1d8&list=PLztdBcd3--U1PR2SBJpdhnCxs50Ta7mr_");
        }

    }

    @FXML
    public void browseDrawingclass(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=u8HwlYEPt2A&list=PLztdBcd3--U3tzQ4LB17HhboWDyh9SOij");

    }

    @FXML
    public void browseHandwritingclass(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=O4946BlxRHI&list=PLztdBcd3--U3PturTsuGaLLOTtZjDY5MP");

    }

    @FXML
    public void selectClass9(MouseEvent mouseEvent){

        class1Course.setValue("Class 1");
        class2Course.setValue("Class 2");
        class3Course.setValue("Class 3");
        class4Course.setValue("Class 4");
        class5Course.setValue("Class 5");
        class6Course.setValue("Class 6");
        class7Course.setValue("Class 7");
        class8Course.setValue("Class 8");
        class10Course.setValue("Class 10 - SEE");
        management11.setValue("Management 11");
        science11.setValue("Science 11");
        management12.setValue("Management 12");
        science12.setValue("Science 12");
        csit.setValue("CSIT");
        bca.setValue("BCA");
        bim.setValue("BIM");
        bbabbs.setValue("BBA/BBS");
        String s = class9Course.getSelectionModel().getSelectedItem().toString();

        if(s == "Science - 1"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=Nomh9KQU8n0&list=PLztdBcd3--U1eiQZDqnexn8MJhicWf_h5");
        }

        if(s == "Science - 2"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=y8nsKJpHPLQ&list=PLztdBcd3--U3WaRWcBCc_j6MTjlnzZuvQ");
        }

        if(s == "Science - Biology"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=HAV_VhchKEA&list=PLztdBcd3--U2Jyanfpjhes7UQFwFC60na");
        }

        if(s == "Compulsory Mathematics- 1"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=CS9ZFCDB8nE&list=PLztdBcd3--U0TMk9wYvEBmHSpH4zSV3Jz");
        }

        if(s == "Compulsory Mathematics- 2"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=NNl4BqOBBHw&list=PLztdBcd3--U3Fl1lZyLri1rHuL3pR9gwV");
        }

        if(s == "Parallelogram"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=AQ4iVqWTGes&list=PLztdBcd3--U06T0HB68nNfd6FnsqTqutH");
        }

        if(s == "Accounting - 1"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=xB-M15z2Mqg&list=PLztdBcd3--U1CoJ9xaXDppfKRA-0OkXog");
        }

        if(s == "Accounting - 2"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=kkvtP0tPQ3k&list=PLztdBcd3--U3rE2GJe35dPEGzZTdiE4L6");
        }

        if(s == "Computer Science-1"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=1LyKke9PnbU&list=PLztdBcd3--U3wVOoqBkVxR7aeZMSNr540");
        }

        if(s == "Computer Science-2"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=YnmkzBRuD24&list=PLztdBcd3--U23FUdIcQC0zR0m12XKvr2l");
        }

        if(s == "Computer Science-3"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=8O-VkCgPKQ0&list=PLztdBcd3--U3MEWXEibAeJCRMIUzphnQh");
        }

        if(s == "Optional Mathematics"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=9W2Sin3TPEI&list=PLztdBcd3--U3yhyhQFX63RWVKM2MzSHQR");
        }

        if(s == "EPH"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=YasJlqkPhow&list=PLztdBcd3--U3u3Zx5OoxiNRoG9NKzcDeQ");
        }

        if(s == "Economics"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=LTpSUnd8fng&list=PLztdBcd3--U1k0enYGEyqDd08HfT750OH");
        }

        if(s == "QBASIC"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=BBB0PFLZ1d8&list=PLztdBcd3--U1PR2SBJpdhnCxs50Ta7mr_");
        }

    }

    @FXML
    public void selectClass10(MouseEvent mouseEvent){

        class1Course.setValue("Class 1");
        class2Course.setValue("Class 2");
        class3Course.setValue("Class 3");
        class4Course.setValue("Class 4");
        class5Course.setValue("Class 5");
        class6Course.setValue("Class 6");
        class7Course.setValue("Class 7");
        class8Course.setValue("Class 8");
        class9Course.setValue("Class 9");
        management11.setValue("Management 11");
        science11.setValue("Science 11");
        management12.setValue("Management 12");
        science12.setValue("Science 12");
        csit.setValue("CSIT");
        bca.setValue("BCA");
        bim.setValue("BIM");
        bbabbs.setValue("BBA/BBS");
        String s = class10Course.getSelectionModel().getSelectedItem().toString();

        if(s == "Computer Science-1"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=CXe0cxMhgzg&list=PLztdBcd3--U0jp8QjZnxZZd7xa6tgr6Hg");
        }

        if(s == "Computer Science-2"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=PS13Ca0wTjg&list=PLztdBcd3--U3UrUjgA3IID8N9TJ-twKry");
        }

        if(s == "Optional Mathematics"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=6UNO5DFuyms&list=PLztdBcd3--U33kG8NH52LStIWwwmXvxDr");
        }

        if(s == "Compulsory Mathematics- 1"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=B4-c14__88k&list=PLztdBcd3--U2-OJ90wv5WECBhpdiV3XGh");
        }

        if(s == "Compulsory Mathematics- 2"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=0x6m6uIvDN8&list=PLztdBcd3--U2WYbsW95MY0eRkt42g3c--");
        }

        if(s == "Science - 1"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=8CzuR5xleoI&list=PLztdBcd3--U1gV72Qkse4Ecb2quKEK8DT");
        }

        if(s == "Science - 2"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=wPoHMIa4DxM&list=PLztdBcd3--U1kGLdcM_07MUq4NCNbZk52");
        }

        if(s == "Science - 3"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=hZb9gflf4D4&list=PLztdBcd3--U0MDjAiHBARXuAu40vcN_PR");
        }

        if(s == "Science - 4"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=46v0o9FvF28&list=PLztdBcd3--U2Q_Rv9UOqOxc0WyjVCYSiD");
        }

        if(s == "Science - 5"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=O75ZM0wNZM8&list=PLztdBcd3--U17J3nysHxdMZOJo7ESG7cY");
        }

        if(s == "Science - 6"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=8B5_nYImb-0&list=PLztdBcd3--U15dd1JpUmBfwt5C64SwPT5");
        }

        if(s == "Accounting - 1"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=VPP5Zv4iv0c&list=PLztdBcd3--U2wuB-3sPAsQ0Va9zOvidkF");
        }

        if(s == "Accounting - 2"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=jva26HoQmTc&list=PLztdBcd3--U2brMl--o3AmTHzch35nHtR");
        }

        if(s == "English - 1"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=WzvrvZXXAhc&list=PLztdBcd3--U3mDa2MGwLcN9YwSPCHklVN");
        }

        if(s == "English - 2"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=gxQfA5pm9qw&list=PLztdBcd3--U2P9X1YyKvzvrcRcP2fFlDb");
        }

        if(s == "EPH"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=EAzndByH-5Y&list=PLztdBcd3--U0Ms12EWEP1bwbgPqZ0ifwj");
        }

        if(s == "QBASIC"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=BBB0PFLZ1d8&list=PLztdBcd3--U1PR2SBJpdhnCxs50Ta7mr_");
        }

        if(s == "10 Set Solution"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=2BkEACpFwZc&list=PLztdBcd3--U3O1nwJAxekVUdbK5SNs9HK");
        }


    }

    @FXML
    public void selectManagement11(MouseEvent mouseEvent){

        class1Course.setValue("Class 1");
        class2Course.setValue("Class 2");
        class3Course.setValue("Class 3");
        class4Course.setValue("Class 4");
        class5Course.setValue("Class 5");
        class6Course.setValue("Class 6");
        class7Course.setValue("Class 7");
        class8Course.setValue("Class 8");
        class9Course.setValue("Class 9");
        class10Course.setValue("Class 10 - SEE");
        science11.setValue("Science 11");
        management12.setValue("Management 12");
        science12.setValue("Science 12");
        csit.setValue("CSIT");
        bca.setValue("BCA");
        bim.setValue("BIM");
        bbabbs.setValue("BBA/BBS");
        String s = management11.getSelectionModel().getSelectedItem().toString();

        if(s == "Link English"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=lTs2F77FAk0&list=PLztdBcd3--U1mi5gJi7HQHV-kP-sDr77w");
        }

        if(s == "Magic of Words"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=zUYiYMbCGqM&list=PLztdBcd3--U2Z-x1KgJkhEAEOAE-syt9W");
        }

        if(s == "Meaning into Words"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=7g5yIxJvnpI&list=PLztdBcd3--U0uH5eJlSwqz75BwrWQE73f");
        }

        if(s == "Computer Science-1"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=II6CSx6nXY4&list=PLztdBcd3--U1kxS7tKROxhxcvlj5KdXD1");
        }

        if(s == "Computer Science-2"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=3KgrUmOn9_w&list=PLztdBcd3--U0suY9qzfEAEpQ5AlsY_f0N");
        }

        if(s == "Mathematics-1"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=aXgzaFo-_8s&list=PLztdBcd3--U3j7OWE9-J8crJWYEX2YU6X");
        }

        if(s == "Mathematics-2"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=PiJWtY3SjuI&list=PLztdBcd3--U2BmGC7hIE3J_hYXMNLhO7g");
        }

        if(s == "Mathematics-3"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=ADiaLd0dBjg&list=PLztdBcd3--U2UDWkhYTbiwmQMvn3YVIXX");
        }

        if(s == "Mathematics-4"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=RrmFit7SN-8&list=PLztdBcd3--U0VgleAjQNithqFFSJYxK83");
        }

        if(s == "Mathematics-5"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=aXgzaFo-_8s&list=PLztdBcd3--U1tBcxhb2JXJEkRoMURNQev");
        }

        if(s == "Economics"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=BzqCL4Sy7dw&list=PLztdBcd3--U0pqqrdSHNVI0y1Xq7B9oqP");
        }

        if(s == "Business Studies"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=TRttyJ0Dc_0&list=PLztdBcd3--U0N7ZDxfX2HFf0ajeQSRIu0");
        }

        if(s == "Accounting"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=NDQdBp5Hoso&list=PLztdBcd3--U3obMJz7eLu-vUmBhyQH_Lv");
        }

    }

    @FXML
    public void selectScience11(MouseEvent mouseEvent){

        class1Course.setValue("Class 1");
        class2Course.setValue("Class 2");
        class3Course.setValue("Class 3");
        class4Course.setValue("Class 4");
        class5Course.setValue("Class 5");
        class6Course.setValue("Class 6");
        class7Course.setValue("Class 7");
        class8Course.setValue("Class 8");
        class9Course.setValue("Class 9");
        class10Course.setValue("Class 10 - SEE");
        management11.setValue("Management 11");
        management12.setValue("Management 12");
        science12.setValue("Science 12");
        csit.setValue("CSIT");
        bca.setValue("BCA");
        bim.setValue("BIM");
        bbabbs.setValue("BBA/BBS");
        String s = science11.getSelectionModel().getSelectedItem().toString();

        if(s == "Link English"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=lTs2F77FAk0&list=PLztdBcd3--U1mi5gJi7HQHV-kP-sDr77w");
        }

        if(s == "Magic of Words"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=zUYiYMbCGqM&list=PLztdBcd3--U2Z-x1KgJkhEAEOAE-syt9W");
        }

        if(s == "Meaning into Words"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=7g5yIxJvnpI&list=PLztdBcd3--U0uH5eJlSwqz75BwrWQE73f");
        }

        if(s == "Computer Science-1"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=II6CSx6nXY4&list=PLztdBcd3--U1kxS7tKROxhxcvlj5KdXD1");
        }

        if(s == "Computer Science-2"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=3KgrUmOn9_w&list=PLztdBcd3--U0suY9qzfEAEpQ5AlsY_f0N");
        }

        if(s == "Mathematics-1"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=aXgzaFo-_8s&list=PLztdBcd3--U3j7OWE9-J8crJWYEX2YU6X");
        }

        if(s == "Mathematics-2"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=PiJWtY3SjuI&list=PLztdBcd3--U2BmGC7hIE3J_hYXMNLhO7g");
        }

        if(s == "Mathematics-3"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=ADiaLd0dBjg&list=PLztdBcd3--U2UDWkhYTbiwmQMvn3YVIXX");
        }

        if(s == "Mathematics-4"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=RrmFit7SN-8&list=PLztdBcd3--U0VgleAjQNithqFFSJYxK83");
        }

        if(s == "Mathematics-5"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=aXgzaFo-_8s&list=PLztdBcd3--U1tBcxhb2JXJEkRoMURNQev");
        }

        if(s == "Physics -1"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=X_vFN3_7TIY&list=PLztdBcd3--U0WkSyEK3PEr4dFfLGniZGf");
        }

        if(s == "Physics -2"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=Hlmmxvm3Fdc&list=PLztdBcd3--U2C-GcyXAHSHyw7H1ZNrD9g");
        }

        if(s == "Biology-Botany"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=0ipnOdj0n94&list=PLztdBcd3--U3Ro88Oe6u4AhIMz0DrGpd7");
        }

        if(s == "Biology-Zoology"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=SabbT6GwCv0&list=PLztdBcd3--U2srkY0TvABdiGorFz9m4-d");
        }

        if(s == "Chemistry"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=ja_V2rpRTYs&list=PLztdBcd3--U2ddZ7qeeEi0C-nfxR6KHP-");
        }

    }

    @FXML
    public void selectManagement12(MouseEvent mouseEvent){

        class1Course.setValue("Class 1");
        class2Course.setValue("Class 2");
        class3Course.setValue("Class 3");
        class4Course.setValue("Class 4");
        class5Course.setValue("Class 5");
        class6Course.setValue("Class 6");
        class7Course.setValue("Class 7");
        class8Course.setValue("Class 8");
        class9Course.setValue("Class 9");
        class10Course.setValue("Class 10 - SEE");
        management11.setValue("Management 11");
        science11.setValue("Science 11");
        science12.setValue("Science 12");
        csit.setValue("CSIT");
        bca.setValue("BCA");
        bim.setValue("BIM");
        bbabbs.setValue("BBA/BBS");
        String s = management12.getSelectionModel().getSelectedItem().toString();

        if(s == "Computer Science-1"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=B8DeuzWdPMQ&list=PLztdBcd3--U3KMWffRXOr3guBKuWBwg7f");
        }

        if(s == "Computer Science-2"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=oKKyjyOoIMY&list=PLztdBcd3--U2zw2oVzd_OfS6A1XagksXA");
        }

        if(s == "C Programming"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=lXs_AAQnwCc&list=PLztdBcd3--U13uQIMtWHRDjm1a76rgKAa");
        }

        if(s == "Mathematics-1"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=HxUuSd24_wU&list=PLztdBcd3--U13KVAuHJHou1nqO2Z4Y8Dr");
        }

        if(s == "Mathematics-2"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=2Bsr9ud3gCM&list=PLztdBcd3--U3gYmDRcbdogV8khNoxTZiJ");
        }

        if(s == "Business Studies"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=DHdxs2VBoEw&list=PLztdBcd3--U0VN2HFGwXH6nCgkVwFuNFF");
        }

        if(s == "Marketing"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=gKUjzhiIq2w&list=PLztdBcd3--U3e9Lu2CCE-Dt_7ykNwyV1K");
        }

        if(s == "Business Maths"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=D-CS5Fb6Z3A&list=PLztdBcd3--U2eDqNtCjWZGQ3Hg1hP9hNV");
        }

        if(s == "Account-1"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=NFSmvlxaZqE&list=PLztdBcd3--U2lXZnxj0ovYa-OFHedeTo3");
        }

        if(s == "Account-2"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=vEJ65mOUUdo&list=PLztdBcd3--U3RQV6Kzn1q7N6jHswcqLRE");
        }

        if(s == "Account-3"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=kUH1UjCAPm8&list=PLztdBcd3--U2ev0Z2WoPh0l6s67OFgbPg");
        }

        if(s == "Business Organization"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=NnTAcgkfyH0&list=PLztdBcd3--U0JiiVo9Xy1oeLWSdSjS7OF");
        }

    }

    @FXML
    public void selectScience12(MouseEvent mouseEvent){

        class1Course.setValue("Class 1");
        class2Course.setValue("Class 2");
        class3Course.setValue("Class 3");
        class4Course.setValue("Class 4");
        class5Course.setValue("Class 5");
        class6Course.setValue("Class 6");
        class7Course.setValue("Class 7");
        class8Course.setValue("Class 8");
        class9Course.setValue("Class 9");
        class10Course.setValue("Class 10 - SEE");
        management11.setValue("Management 11");
        science11.setValue("Science 11");
        management12.setValue("Management 12");
        csit.setValue("CSIT");
        bca.setValue("BCA");
        bim.setValue("BIM");
        bbabbs.setValue("BBA/BBS");
        String s = science12.getSelectionModel().getSelectedItem().toString();

        if(s == "Mathematics-1"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=HxUuSd24_wU&list=PLztdBcd3--U13KVAuHJHou1nqO2Z4Y8Dr");
        }

        if(s == "Mathematics-2"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=2Bsr9ud3gCM&list=PLztdBcd3--U3gYmDRcbdogV8khNoxTZiJ");
        }

        if(s == "Chemistry"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=fY2iz7PhIzs&list=PLztdBcd3--U0XMHUESm6g_3WLEUHY9-k0");
        }

        if(s == "Physics"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=GdglapSobA8&list=PLztdBcd3--U0_E5EjtOl35YcOJ4HVwbdW");
        }

        if(s == "Botany"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=VFN9PNwwJcU&list=PLztdBcd3--U3igIij1NT-WaDp3Zy7AaDV");
        }

    }

    @FXML
    public void browseSee1(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=kHezp-hw0pI&list=PLztdBcd3--U2fUWgrztAacSeZ3RrApIyg");

    }

    @FXML
    public void browseSee2(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=hCzlOp6z5qQ&list=PLztdBcd3--U0-zITNtUOJJDdZ9Ziai_No");

    }

    @FXML
    public void pclNursing(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=TV5eVMY7E7k&list=PLztdBcd3--U1K2lBfxia4aCjY9oV3kKw1");

    }

    @FXML
    public void lokSewa(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=J-_vbAtSGco&list=PLztdBcd3--U0lvIvQtKJblw1i9k9wBYug");

    }

    @FXML
    public void cmat(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=1Mu-BKnrl7U&list=PLztdBcd3--U1fztlz-nt3Zx3n90fEFhRh");

    }

    @FXML
    public void mbbs(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=ecMtD2rJZf4&list=PLztdBcd3--U3PsjyQMeZwkZO5b4PKnUIU");

    }

    @FXML
    public void nrb(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=PbxzsZHLK8I&list=PLztdBcd3--U1Tf-h5M3eZbp9EqJYAsSIc");

    }


    @FXML
    public void pcl(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=idQDi_i_eUc&list=PLztdBcd3--U2fGGe96rIbtB0k70jq4-K3");

    }

    @FXML
    public void ctevtCF(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=oXnEDD48BLU&list=PLztdBcd3--U3nhxqTp8xjvV7DUEI1h5qi");

    }

    @FXML
    public void ctevtCA(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=TkuIHRKKOQA&list=PLztdBcd3--U3sWcMCoy4aoOjYgf4VV8aN");

    }

    @FXML
    public void ctevtITf(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=8URU7MHTJo8&list=PLztdBcd3--U13EnaWGNaCdpoYMBn21Rq9");

    }

    @FXML
    public void ctevtP(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=9ozIU3Mt2Hc&list=PLztdBcd3--U3yK60DU8aTn768bBpbP3qU");

    }

    @FXML
    public void ctevtME(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=yFoknL7wxvQ&list=PLztdBcd3--U2XE0APxGpQMuCyjN3gtfGW");

    }

    @FXML
    public void selectCsit(MouseEvent mouseEvent){

        class1Course.setValue("Class 1");
        class2Course.setValue("Class 2");
        class3Course.setValue("Class 3");
        class4Course.setValue("Class 4");
        class5Course.setValue("Class 5");
        class6Course.setValue("Class 6");
        class7Course.setValue("Class 7");
        class8Course.setValue("Class 8");
        class9Course.setValue("Class 9");
        class10Course.setValue("Class 10 - SEE");
        management11.setValue("Management 11");
        science11.setValue("Science 11");
        management12.setValue("Management 12");
        science12.setValue("Science 12");
        bca.setValue("BCA");
        bim.setValue("BIM");
        bbabbs.setValue("BBA/BBS");
        String s = csit.getSelectionModel().getSelectedItem().toString();

        if(s == "Information Technology"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=nwS_NwoL70g&list=PLztdBcd3--U1sNePeJIm4xm9WNGCDf8q_");
        }

        if(s == "Internet Technology"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=JDvbdvrTt-Q&list=PLztdBcd3--U2RsJcfANdHwlLQyL1uE1yB");
        }

        if(s == "Physics"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=15dXD8s-Bkk&list=PLztdBcd3--U3XhTAN2lnEnLw6HR16TIAi");
        }

        if(s == "Digital Logic"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=htJDQ8U6cOA&list=PLztdBcd3--U3oeGupVkKP3-Rh5uM8KKgu");
        }

        if(s == "C Programming"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=lXs_AAQnwCc&list=PLztdBcd3--U13uQIMtWHRDjm1a76rgKAa");
        }

    }

    @FXML
    public void selectBca(MouseEvent mouseEvent){

        class1Course.setValue("Class 1");
        class2Course.setValue("Class 2");
        class3Course.setValue("Class 3");
        class4Course.setValue("Class 4");
        class5Course.setValue("Class 5");
        class6Course.setValue("Class 6");
        class7Course.setValue("Class 7");
        class8Course.setValue("Class 8");
        class9Course.setValue("Class 9");
        class10Course.setValue("Class 10 - SEE");
        management11.setValue("Management 11");
        science11.setValue("Science 11");
        management12.setValue("Management 12");
        science12.setValue("Science 12");
        bim.setValue("BIM");
        csit.setValue("CSIT");
        bbabbs.setValue("BBA/BBS");
        String s = bca.getSelectionModel().getSelectedItem().toString();

        if(s == "Information System"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=_GHj2RRdKQA&list=PLztdBcd3--U2OVxliQqp4f6mkkmjHccML");
        }

        if(s == "Internet Technology"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=JDvbdvrTt-Q&list=PLztdBcd3--U2RsJcfANdHwlLQyL1uE1yB");
        }

        if(s == "Maths"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=bf2qiUcic9Q&list=PLztdBcd3--U3cB-a81e0Bz0Hh15zVxZ_Y");
        }

        if(s == "Digital Logic"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=htJDQ8U6cOA&list=PLztdBcd3--U3oeGupVkKP3-Rh5uM8KKgu");
        }

        if(s == "C Programming"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=lXs_AAQnwCc&list=PLztdBcd3--U13uQIMtWHRDjm1a76rgKAa");
        }

        if(s == "Statistic"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=6YK3wKx6ziw&list=PLztdBcd3--U3onnDMEu1-uOd13kYrzzZq");
        }

    }

    @FXML
    public void selectBim(MouseEvent mouseEvent){

        class1Course.setValue("Class 1");
        class2Course.setValue("Class 2");
        class3Course.setValue("Class 3");
        class4Course.setValue("Class 4");
        class5Course.setValue("Class 5");
        class6Course.setValue("Class 6");
        class7Course.setValue("Class 7");
        class8Course.setValue("Class 8");
        class9Course.setValue("Class 9");
        class10Course.setValue("Class 10 - SEE");
        management11.setValue("Management 11");
        science11.setValue("Science 11");
        management12.setValue("Management 12");
        science12.setValue("Science 12");
        bca.setValue("BCA");
        csit.setValue("CSIT");
        bbabbs.setValue("BBA/BBS");
        String s = bim.getSelectionModel().getSelectedItem().toString();

        if(s == "Information System"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=noUK3bK86AA&list=PLztdBcd3--U23lgf40f3C00UUHrkFCF9E");
        }

        if(s == "Information Management"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=YkgCeNn5yVc&list=PLztdBcd3--U2NxmCyqZQQnlPQpAPlqmWO");
        }

        if(s == "Digital Logic"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=htJDQ8U6cOA&list=PLztdBcd3--U3oeGupVkKP3-Rh5uM8KKgu");
        }

        if(s == "C Programming"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=lXs_AAQnwCc&list=PLztdBcd3--U13uQIMtWHRDjm1a76rgKAa");
        }

        if(s == "Maths"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=ADiaLd0dBjg&list=PLztdBcd3--U2UDWkhYTbiwmQMvn3YVIXX");
        }

    }

    @FXML
    public void bEd(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=HN7UMilyGsg&list=PLztdBcd3--U35RrMy6bwRvTSAgzQukVRj");

    }

    @FXML
    public void bbabbs(MouseEvent mouseEvent){

        class1Course.setValue("Class 1");
        class2Course.setValue("Class 2");
        class3Course.setValue("Class 3");
        class4Course.setValue("Class 4");
        class5Course.setValue("Class 5");
        class6Course.setValue("Class 6");
        class7Course.setValue("Class 7");
        class8Course.setValue("Class 8");
        class9Course.setValue("Class 9");
        class10Course.setValue("Class 10 - SEE");
        management11.setValue("Management 11");
        science11.setValue("Science 11");
        management12.setValue("Management 12");
        science12.setValue("Science 12");
        bca.setValue("BCA");
        csit.setValue("CSIT");
        bim.setValue("BIM");
        String s = bbabbs.getSelectionModel().getSelectedItem().toString();

        if(s == "Statistic-1"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=mmwJvRFTyzQ&list=PLztdBcd3--U25ZV3dyGCY53GU8nHZ9EMk");
        }

        if(s == "Statistic-2"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=YoSNAo-8Em4&list=PLztdBcd3--U2vCG86MAgmWX0Cj9ZiFESy");
        }

        if(s == "Statistic-3"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=_a1l7Km1XPc&list=PLztdBcd3--U3WTdIGmNArv2JtTbUrRtwf");
        }

        if(s == "Index Numbers"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=cUUiQMx6lpY&list=PLztdBcd3--U1jFDgWaHD_9ynnNLx5oyRq");
        }

        if(s == "Correlation"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=dvvy9h9AWNk&list=PLztdBcd3--U1Lzv0ggpBaO9f0QYDdN7UU");
        }

        if(s == "Skewness,Kurtosis"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=LxR2KzCA9Mo&list=PLztdBcd3--U0EmtmU9bb3HewMLxgc_XtN");
        }

        if(s == "Probability"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=XPlU6khatvg&list=PLztdBcd3--U1-3S4SC8nNs2W6OfJnP3OH");
        }

        if(s == "Poisson Distribution"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=JXQLv0rF_VI&list=PLztdBcd3--U0oX-ByHeIQY85pVQDMd7MK");
        }

        if(s == "Regression Analysis"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=hnVh8iCGzXA&list=PLztdBcd3--U2G5trew6fSQRfQbM2nLrxh");
        }

        if(s == "Presentation of Data"){
            WebEngine engine = webView.getEngine();
            engine.load("https://www.youtube.com/watch?v=Vzvi_M2vBq0&list=PLztdBcd3--U015evg5uct02v44DV_7tgo");
        }

    }

    @FXML
    public void drawing(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=u8HwlYEPt2A&list=PLztdBcd3--U3tzQ4LB17HhboWDyh9SOij");

    }

    @FXML
    public void english1(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=59EFAjz3nks&list=PLztdBcd3--U0I42NgsIlg2aLzLtkf-GTA");

    }

    @FXML
    public void english2(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=RiQq8uL-OYs&list=PLztdBcd3--U2jzvAtz6CZNRrvI8wUSwn3");

    }

    @FXML
    public void english3(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=kkABp5OwDkw&list=PLztdBcd3--U1Ao7J9-R7AamoDZHPFHEmZ");

    }

    @FXML
    public void japLang(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=zmUM-RbJGLQ&list=PLztdBcd3--U1M8sF0xza4x94DAV2VGIR2");

    }

    @FXML
    public void chiLang(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=tQ4XKouLlYk&list=PLztdBcd3--U1M4SgzQ3Iqkh_YAjKQ9HVV");

    }

    @FXML
    public void ArcGIS(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=qOcyRC_nIf0&list=PLztdBcd3--U3QydHhB-qrbDouT2TGWEbW");

    }

    @FXML
    public void ITpathway(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=ixnAUwQBIg4&list=PLGMmunRffJa6-IgwJCqLG5boI30UcVD-b");

    }

    @FXML
    public void studyGuide(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=nuE1dGqpltE&list=PLztdBcd3--U3_jnpXqYowZZblUycr-Q1w");

    }

    @FXML
    public void basicComp(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=M9l0hDg7aRM&list=PLztdBcd3--U3jz6RqSvzwRRVFKUuOb7rj");

    }

    @FXML
    public void basicComp2(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=PFyZCrhnkFg&list=PLztdBcd3--U0lz_O71OhhGh7Vc_jmkhJP");

    }

    @FXML
    public void win7(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/playlist?list=PLztdBcd3--U22ycHyLcIm3jGAWBEQTHfH");

    }

    @FXML
    public void win10(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/playlist?list=PLztdBcd3--U2rPB7IZqvupkXArhV0JUAw");

    }

    @FXML
    public void powerpnt(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=4nyD592DwqY&list=PLztdBcd3--U33gm_8C0p86qNHim9FCMu3");

    }

    @FXML
    public void word(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=SBd43duCirM&list=PLztdBcd3--U1nqBirh-DLYmeivy0J9Uol");

    }

    @FXML
    public void tipstricks(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=6Da4pOAN7Xg&list=PLztdBcd3--U1wRvyNyHUmYjQhN0G34Biz");

    }

    @FXML
    public void socialmedia(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=jYZLSj9ZXXo&list=PLztdBcd3--U0M1wvymIReQhuFtoBkd5s9");

    }

    @FXML
    public void comptiaITf(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=XUzqA_ejhnQ&list=PLztdBcd3--U15COP4o-oerLdEEoStk4qo");

    }

    @FXML
    public void comptiaAp(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=MJel0PIX3kk&list=PLztdBcd3--U1XRu8CJA63_uy8jYitUb_x");

    }

    @FXML
    public void hwN(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=ufCqjps2DrE&list=PLztdBcd3--U2Y-VFKPjCj9wR05hgC_uTu");

    }

    @FXML
    public void webDev1(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=xQlRN5sVS7w&list=PLztdBcd3--U0IgIJTPk8LBX1RUmLnPvtz");

    }

    @FXML
    public void webDev2(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=dNS7JDt6NqY&list=PLztdBcd3--U1OdiuYdzx7AEs3rLOWoRfT");

    }

    @FXML
    public void webDev3(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=oDghXQ6lk_M&list=PLztdBcd3--U17M2PbR9iDPCrEACNC0wqL");

    }

    @FXML
    public void comptiaNp(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=7A8PI57jDdA&list=PLGMmunRffJa5zyCur60pNux4fJUNCaFk1");

    }

    @FXML
    public void ipSub(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=mYSU-__YZhs&list=PLztdBcd3--U1e9wAD9jP-DJjCm9T16wov");

    }

    @FXML
    public void gitHub(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=0IuyIfTBgGM&list=PLztdBcd3--U3eHDtneZkrce_b5P_CS0PL");

    }

    @FXML
    public void hacking1(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=MV-DlDSuxQE&list=PLztdBcd3--U2jaliACIYis5-ce0GhU35Q");

    }

    @FXML
    public void hacking2(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=KTCS8Je6qiQ&list=PLztdBcd3--U0sIKPFzPUuxnvSaKThZA5n");

    }

    @FXML
    public void cProgramming(MouseEvent mouseEvent){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=lXs_AAQnwCc&list=PLztdBcd3--U13uQIMtWHRDjm1a76rgKAa");

    }

    @FXML
    public void fbGroup(MouseEvent mouseEvent){

        try{
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/groups/Plus2NEBHSEBFreeTutorials"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void feedbackForm(MouseEvent mouseEvent){

        try{
            Desktop.getDesktop().browse(new URI("https://docs.google.com/forms/d/e/1FAIpQLSelFbCYMZ7r75unawxHnF2Zw64vuAex6n7HES6YL2jarI0o_w/viewform"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void volForm(MouseEvent mouseEvent){

        try{
            Desktop.getDesktop().browse(new URI("https://docs.google.com/forms/d/e/1FAIpQLSc4BpNJc2jj_yTRs1YJhaT8VFIgsn_qpQ02vAbhLn-hYwmTqw/viewform"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void browseFB(MouseEvent mouseEvent){

        try{
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/NepalOnlineSchool/"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void browseIG(MouseEvent mouseEvent){

        try{
            Desktop.getDesktop().browse(new URI("https://www.instagram.com/nepalonlineschoolnonprofit/"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void browseT(MouseEvent mouseEvent){

        try{
            Desktop.getDesktop().browse(new URI("https://t.me/nepalonlineschool"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void browseL(MouseEvent mouseEvent){

        try{
            Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/nepalonlineschool-non-profit-project/"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
