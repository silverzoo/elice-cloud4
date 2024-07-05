package LetsFish;

import java.util.Scanner;

public class FishGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Let’s Fish! 500P 이상이 되면 성공 \uD83D\uDE06 미만이면 실패 \uD83D\uDE2D");
        System.out.print("Name : ");

        String name = sc.nextLine();
        int[] times = new int[10];
        int point= 0, item = 3, idx = 0;

        System.out.println(STR. "\{name}님, 지금부터 낚시게임을 시작합니다!");

        while(true) {
            System.out.println("원하는 옵션을 선택해주세요.");
            System.out.println("\uD83D\uDC20----------------------------\uD83C\uDFA3");
            System.out.println("    1. 낚시 시도하기");
            System.out.println("    2. 최고급 미끼로 낚시 시도하기");
            System.out.println("    3. 그냥 집에 갈래");
            System.out.println("\uD83D\uDC20----------------------------\uD83C\uDFA3");
            int opt = sc.nextInt();

            if(opt == 1) {
                times[idx] = (int)(Math.random()*100+1);

                if(times[idx] >= 50) {
                    point += times[idx];
                    System.out.println(STR."낚시 성공! \{times[idx]}P를 획득했습니다.");
                    System.out.println(STR."현재 포인트는 \{point}P, 남은 낚시 횟수는 \{9-idx}번, 남은 최고급 미끼는 \{item}개");
                    idx++;
                } else {
                    System.out.println(STR."낚시 실패! 포인트를 획득하지 못했습니다.");
                    System.out.println(STR."현재 포인트는 \{point}P, 남은 낚시 횟수는 \{9-idx}번, 남은 최고급 미끼는 \{item}개");
                    idx++;
                }
            }
            else if(opt == 2) {
                if(item == 0) {
                    System.out.println("더 이상 남아있는 최고급 미끼가 없습니다.");
                } else {
                    times[idx] = (int)(Math.random()*100+1) + 30;

                    if(times[idx] >= 50) {
                        point += times[idx];
                        item --;
                        System.out.println(STR."낚시 성공! \{times[idx]}P를 획득했습니다.");
                        System.out.println(STR."현재 포인트는 \{point}P, 남은 낚시 횟수는 \{9-idx}번, 남은 최고급 미끼는 \{item}개");
                        idx++;
                    } else {
                        item--;
                        System.out.println(STR."낚시 실패! 포인트를 획득하지 못했습니다.");
                        System.out.println(STR."현재 포인트는 \{point}P, 남은 낚시 횟수는 \{9-idx}번, 남은 최고급 미끼는 \{item}개");
                        idx++;
                    }
                }
            }
            else if(opt == 3) {
                System.out.println("게임을 종료합니다.");
                break;
            }
            else {
                System.out.println("잘못 입력하셨습니다.");
            }

            if(idx > 9) {
                System.out.println("게임이 종료되었습니다.");
                if(point >= 500) {
                    System.out.println("\uD83D\uDC20----------------------------\uD83C\uDFA3");
                    System.out.println("    WIN! 축하드립니다 \uD83D\uDC4F");
                    System.out.println(STR."    당신의 최종 점수는 \{point}P입니다.");
                    System.out.println("\uD83D\uDC20----------------------------\uD83C\uDFA3");
                } else {
                    System.out.println("\uD83D\uDC20----------------------------\uD83C\uDFA3");
                    System.out.println("    LOSE~ 더 분발하세요 \uD83D\uDE1C");
                    System.out.println(STR."    당신의 최종 점수는 \{point}P입니다.");
                    System.out.println("\uD83D\uDC20----------------------------\uD83C\uDFA3");
                }
                break;
            }
        }
    }
}
