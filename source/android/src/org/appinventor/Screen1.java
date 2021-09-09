package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Web;
class Screen1 extends Form implements HandlesEventDispatching {
  private Button 버튼1;
  private Label 레이블1;
  private Label 레이블4;
  private Label 레이블2;
  private Label 레이블3;
  private Label 레이블5;
  private Label 레이블6;
  private Button 버튼3;
  private Button 버튼2;
  private Web 웹1;
  private Web 웹2;
  protected void $define() {
    this.AppName("musiccc");
    this.Icon("c-001(1).png");
    this.Title("Screen1");
    버튼1 = new Button(this);
    버튼1.Height(50);
    버튼1.Width(50);
    버튼1.Image("a-001.png");
    레이블1 = new Label(this);
    레이블1.FontBold(true);
    레이블1.FontSize(25);
    레이블1.Text("음악 투고 사이트 오전");
    레이블4 = new Label(this);
    레이블4.Text("여기에 추천음악 이미지 3개");
    레이블2 = new Label(this);
    레이블2.FontBold(true);
    레이블2.FontSize(18);
    레이블2.Text("이용자분들이 선정하신 인기곡");
    레이블3 = new Label(this);
    레이블3.FontSize(12);
    레이블3.Height(100);
    레이블3.Width(LENGTH_FILL_PARENT);
    레이블3.Text("오전이란?
    all과 music의 앞글자를 따면 am인데 am은 오전이라는 뜻이어서 이런 이름을 짓게되었습니다.이름그대로 누구나 자신의 음악을 무료로 투고할 수 있는 사이트 입니다");
    레이블5 = new Label(this);
    레이블5.Text("레이블5 의 텍스트");
    레이블6 = new Label(this);
    레이블6.Text("레이블6 의 텍스트");
    버튼3 = new Button(this);
    버튼3.BackgroundColor(0xFFFFAFAF);
    버튼3.Text("(구글 연결)");
    버튼2 = new Button(this);
    버튼2.BackgroundColor(0xFF00FF00);
    버튼2.Text("(네이버 연결)");
    웹1 = new Web(this);
    웹1.Url(http://boostcourse-appapi.connect.or.kr:10000/movie/readMovieList);
    웹2 = new Web(this);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}