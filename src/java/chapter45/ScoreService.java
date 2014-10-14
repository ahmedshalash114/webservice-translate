/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter45;

import java.util.HashMap;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author TamallyMaak
 */
@WebService(serviceName = "ScoreService")
public class ScoreService {

    String a;

    // Stores scores in a map indexed by name
//  private HashMap<String, Double> scores = 
//    new HashMap<String, Double>();
    public ScoreService() {
//    scores.put("John", 90.5);
//    scores.put("Michael", 100.0);
//    scores.put("Michelle", 98.5);
    }

    @WebMethod(operationName = "translate")
    public String translate(String name) {
//    Double d = scores.get(name);
//    if (d == null) {
//      System.out.println("Student " + name + " is not found ");
//      return -1;
//    }
//    else {
//      System.out.println("Student " + name + "\'s score is "
//        + d.doubleValue());
//      return d.doubleValue();
//    }
        
 // ahmed shalash 01090875416 last edit was at 8:27 29/8
 // This code to translate from the Franko to arab words and also it translate 
 //         
 // Refernce are down
 //http://ar.wikipedia.org/wiki/%D9%85%D9%84%D8%AD%D9%82:%D9%82%D8%A7%D8%A6%D9%85%D8%A9_%D8%B1%D9%85%D9%88%D8%B2_%D8%A7%D9%84%D9%85%D8%B4%D8%A7%D8%B9%D8%B1       
 //http://www.yamli.com/editor/ar/       
 //http://princessesdisney.ahlamontada.net/t5602-topic       
        
        
        String translatee = name;
        translatee.toLowerCase();

         a = translatee.replace("dh", "ذ").replace("kh", "خ").replace("sms", "رساله نصيه قصيره")
                .replace("dh", "ظ").replace("th", "ث").replace("gh", "غ").replace("isa", "ان شاء الله").replace("cu", "اراك لاحقا").replace("msa", "ماشاء الله")
                .replace("a", ".( )(ه)(ا)(ع)").replace("ee", "ي").replace("sh", "ش").replace("ie", "ي").replace("in", "ان")
                .replace("el7","الحمد لله").replace("LOL ","بضحك بصوت عالي ").replace("BRB "," سأعود قريبا")
                .replace("TYT ","خد وقتك  ").replace("WB ","مرحبا بعودتك ").replace("back ", " رجعت")
                .replace("BTW ", "علي فكره ").replace("FYI ","لمعلوماتك ").replace("OMG "," ياالهي")
                .replace("ATW "," بدون تفكير").replace("FTW ","شئ بيفوز بالنهايه ").replace("IMO ","في رأي ")
                .replace("IMHO ","في رأي المتواضع " ).replace("BMW "," عضو مصيره الطرد ")
                .replace("thx ","شكرا ").replace("ty ","شكرا لك ").replace("BFN "," سلام دلوقتي")
                .replace("GTG","لازم امشي ").replace("DC ","النت مفصول")
                .replace("7", "ح").replace("r", "ر").replace("z", "ز").replace("s", ".(ص)(س)")
                .replace("p", "ب").replace("t", "ت‎").replace("s", "ث").replace("z", "ذ")
                .replace("g", "ج").replace("j", "ج").replace("7'", "خ").replace("5", "خ")
                .replace("d", ".(ض)(د)").replace("9'", "ض")
                .replace("9", "ص").replace("3", "ع").replace("s", "ص").replace("t", "ط")
                .replace("6", "ط").replace("z", "ظ").replace("6'", "ظ").replace("t'", "ظ")
                .replace("m", "م").replace("b", "ب").replace("o", ".( )(و)(ع)").replace("u", ".(و)(يو)( )(ي)")
                .replace("f", "ف").replace("2", "ء").replace("v", "ف")
                .replace("q", "ق").replace("k", "ك").replace("l", "ل")
                .replace("n", "ن").replace("h", ".(ه)(ح)").replace("w", "و")
                .replace("y", "ي").replace("i", "ي")
                .replace("e", " .(ي)(اي)( )").replace(":^)", "الابتسامة أو الوجه السعيد").replace(":-)", "الابتسامة أو الوجه السعيد")
                .replace(":)", "الابتسامة أو الوجه السعيد").replace(":o)", "الابتسامة أو الوجه السعيد")
                .replace(":]", "الابتسامة أو الوجه السعيد").replace(":3", "الابتسامة أو الوجه السعيد")
                .replace(":c)", "الابتسامة أو الوجه السعيد").replace(":c)", "الابتسامة أو الوجه السعيد")
                .replace(":>", "الابتسامة أو الوجه السعيد").replace("=]", "الابتسامة أو الوجه السعيد")
                .replace("8)", "الابتسامة أو الوجه السعيد").replace("=)", "الابتسامة أو الوجه السعيد")
                .replace(":}", "الابتسامة أو الوجه السعيد").replace(":D", "ابتسامه كبيره بهجه")
                .replace("C:", "ابتسامه كبيره بهجه ").replace("()", "عناق").replace("XD", "َضجكه كبيره")
                .replace("xd", "ضحكه").replace(":{", "التجهم او العبس").replace(":-", "التجهم او العبس ")
                .replace("(:", "التجهم او العبس ").replace("( :", "التجهم و العبس ").replace("-c", "التجهم او العبس")
                .replace(":c", "التجهم او العبس ").replace(":-<", "التجهم و العبس ").replace(":<", "التجهم او العبس ")
                .replace(":-[", "التجهم او العبس ").replace(":[", "التجهم او العبس ")
                .replace("d:", "الرعب والاشمئزاز والحزن والفزع الكبير").replace("d8", "الرعب والاشمئزاز والحزن والفزع الكبير")
                .replace("d;", "الرعب والاشمئزاز والحزن والفزع الكبير").replace("d=", "الرعب والاشمئزاز والحزن والفزع الكبير")
                .replace("v.v", "الرعب والاشمئزاز والحزن والفزع الكبير").replace("*)", "الغمزه")
                .replace(";-)", "الغمزه").replace(";)", "الغمزه").replace("*-)", "الغمزه")
                .replace(";-]", "الغمزه").replace(";]", "الغمزه").replace(";D", "الغمزه")
                .replace(":-P", "اخراج اللسان ").replace(":b", "اخراج اللسان ").replace(":-b", "اخراج اللسان")
                .replace(":P", "اخراج اللسان").replace(":Þ", "اخراج اللسان").replace("x-p", "اخراج اللسان")
                .replace("xp", "اخراج اللسان").replace(":p", "اخراج اللسان").replace("=p", "اخراج اللسان")
                .replace(":-o","المفاجأة والصدمة، عسير الوصف").replace("O.o","المفاجأة والصدمة، عسير الوصف")
                .replace("o_o ","المفاجأة والصدمة، عسير الوصف").replace("o..o","المفاجأة والصدمة، عسير الوصف")
                .replace("c.c", "لف العنين او الرفض ").replace(":-/","متشكك، منزعج، قلق، غير مستقر، متردد")
                .replace(":/", "متشكك، منزعج، قلق، غير مستقر، متردد").replace("=/", "متشكك، منزعج، قلق، غير مستقر، متردد")
                .replace(":s", "متشكك، منزعج، قلق، غير مستقر، متردد").replace("qb","قبعه ")
                .replace(":)~","الترويل سيلان اللعاب").replace("-3","ملاك برئ");
                   
                
                
                 	
        return a;
    }
}
