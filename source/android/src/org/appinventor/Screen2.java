package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
class Screen2 extends Form implements HandlesEventDispatching {
  private Label 레이블2;
  private Label 레이블3;
  private Label 레이블1;
  protected void $define() {
    this.AppName("musiccc");
    this.Title("Screen2");
    레이블2 = new Label(this);
    레이블2.Text("팝, 클래식, 가요 이미지(선택시 다음 페이지)");
    레이블3 = new Label(this);
    레이블3.Text("동요, 아이돌, 레트로 이미지(선택시 다음 페이지)");
    레이블1 = new Label(this);
    레이블1.FontBold(true);
    레이블1.Height(60);
    레이블1.Width(LENGTH_FILL_PARENT);
    레이블1.Text("오전이란?
    all과 music의 앞글자를 따면 am인데 am은 오전이라는 뜻이어서 이런 이름을 짓게되었습니다.이름그대로 누구나 자신의 음악을 무료로 투고할 수 있는 사이트 입니다");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}