package com.mission.wolf.bootlean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @author Captain Wolf
 * 2018/9/26 22:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EMailTest {
  @Autowired
  JavaMailSender mailSender;

  @Test
  public void sendMailTest(){
    SimpleMailMessage message = new SimpleMailMessage();
    message.setSubject("通知-邮件测试");
    message.setText("测试-这是一封测试邮件");
    message.setFrom("1281580625@qq.com");
    message.setTo("1738382631@qq.com");
    mailSender.send(message);

  }
  @Test
  public void sendMimeMessageTest() throws Exception {
    MimeMessage mimeMessage = mailSender.createMimeMessage();
    MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

    helper.setSubject("通知-邮件测试2");
    helper.setText("<b style='color:red'>测试-这是一封测试邮件</b>",true);
    helper.setFrom("1281580625@qq.com");
    helper.setTo("1738382631@qq.com");

    //上传文件
    helper.addAttachment("1.jpg",new File("D:\\image\\001.jpg"));
    helper.addAttachment("2.jpg",new File("D:\\image\\002.jpg"));

    mailSender.send(mimeMessage);

  }
}
