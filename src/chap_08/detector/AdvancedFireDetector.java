package chap_08.detector;

import chap_08.reporter.Reportable;

public class AdvancedFireDetector implements Detectable{
    @Override
    public void detect() {
        System.out.println("향상된 성능으로 화재를 감지합니다.");
    }
}
