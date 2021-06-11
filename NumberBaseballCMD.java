import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

class NumberBaseballCMD
{
	public NumberBaseballCMD(){
	
	int[] num_ball = new int[3];
	int[] num_bat = new int[3];

	int strike_c = 0; 
	int ball_c = 0;
	int out_c = 0;

	// 임의의 3개의 수 생성
	Random rand = new Random(); // seed = System.nanoTime()
	for(int i = 0; i < num_ball.length; i++)
	{
		num_ball[i] = rand.nextInt(10);
	}
	System.out.println(Arrays.toString(num_ball));
	
	// 사용자로부터 숫자 입력받기
	while(strike_c != 3)
	{
			System.out.print("세자리 수를 입력하세요.: ");
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < num_bat.length; i++)
		{
			num_bat[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(num_bat));

		strike_c = 0; 
		ball_c = 0;
		out_c = 0;

		// 볼 개수 확인하기
		for (int i = 0; i < num_ball.length; i++)
		{
			boolean flag = contains(num_bat, num_ball[i]);

			if(flag)
			{
				ball_c++;
			}
	
		}

		// 스트라이크 개수 확인하기
		for (int i = 0; i < num_ball.length; i++)
		{
			if(num_ball[i] == num_bat[i])
			{
				strike_c++;
			}
		}
		
		// 결과 출력
		if (strike_c == 3)
		{	
			System.out.println("SUCCESS");
		}
		else if (strike_c > 0)
		{
			System.out.println(strike_c + " S");
			System.out.println(ball_c + " B");
		}else if (ball_c > 0)
		{
			System.out.println(ball_c + " B");
		}else{
			System.out.println("OUT");
		}
	}

	}
	public static boolean contains(final int[] arr, final int key){
		return Arrays.stream(arr).anyMatch(i -> i == key);
	}
}
