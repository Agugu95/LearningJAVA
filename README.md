# LearningJAVA

0708 멀티스레드 챕터 종료   

0717 스트림과 병렬처리  
NewException Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed  
기존에 사용했던 스트림의 최종 처리를 하지 않은 채 다른 스트림 메소드를 호출하려고 해서 발생한 예외  
public class IllegalStateException
extends RuntimeException
Signals that a method has been invoked at an illegal or inappropriate time. In other words, the Java environment or Java application is not in an appropriate state for the requested operation.  
런타임 익셉션으로 작업 중 부적절한 메소드 호출이 일어났음을 의미  

0721 자바 I/O 입출력 기반 네트워킹 프로그래밍  
