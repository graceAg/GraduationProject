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

	// ������ 3���� �� ����
	Random rand = new Random(); // seed = System.nanoTime()
	for(int i = 0; i < num_ball.length; i++)
	{
		num_ball[i] = rand.nextInt(10);
	}
	System.out.println(Arrays.toString(num_ball));
	
	// ����ڷκ��� ���� �Է¹ޱ�
	while(strike_c != 3)
	{
			System.out.print("���ڸ� ���� �Է��ϼ���.: ");
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < num_bat.length; i++)
		{
			num_bat[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(num_bat));

		strike_c = 0; 
		ball_c = 0;
		out_c = 0;

		// �� ���� Ȯ���ϱ�
		for (int i = 0; i < num_ball.length; i++)
		{
			boolean flag = contains(num_bat, num_ball[i]);

			if(flag)
			{
				ball_c++;
			}
	
		}

		// ��Ʈ����ũ ���� Ȯ���ϱ�
		for (int i = 0; i < num_ball.length; i++)
		{
			if(num_ball[i] == num_bat[i])
			{
				strike_c++;
			}
		}
		
		// ��� ���
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
