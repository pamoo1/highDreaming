package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
class Screen4 extends Form implements HandlesEventDispatching {
  private Label 레이블3;
  private Label 레이블2;
  private Label 레이블1;
  private Button 버튼1;
  protected void $define() {
    this.AppName("musiccc");
    this.Title("Screen4");
    레이블3 = new Label(this);
    레이블3.Text("여기에 파일 업로드가 들어감");
    레이블2 = new Label(this);
    레이블2.Text("여기에 파일이름 ");
    레이블1 = new Label(this);
    레이블1.Text("여기에 음악 제작자");
    버튼1 = new Button(this);
    버튼1.BackgroundColor(0x5654FFC7);
    버튼1.Enabled(false);
    버튼1.FontBold(true);
    버튼1.FontSize(40);
    버튼1.Height(100);
    버튼1.Width(260);
    버튼1.Shape(1);
    버튼1.Text("투고하기");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}