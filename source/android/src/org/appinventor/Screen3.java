package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
class Screen3 extends Form implements HandlesEventDispatching {
  private Label 레이블1;
  private Label 레이블2;
  protected void $define() {
    this.AppName("musiccc");
    this.Title("Screen3");
    레이블1 = new Label(this);
    레이블1.Text("선택한 이미지의 제목");
    레이블2 = new Label(this);
    레이블2.Text("순위(총 5개) ");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}