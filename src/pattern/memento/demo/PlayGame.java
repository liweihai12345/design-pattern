package pattern.memento.demo;

public class PlayGame {
	public static void main(String[] args) {

		GamePlayer player= new GamePlayer("����ң",100,100,1);
		CaretakerPlayer backup = new CaretakerPlayer();
		backup.setBackup(player.saveBackup());
		player.KillBoss();
		player.resumePlayer(backup.getBackup());
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("��Ѫ����");
		System.out.println("+++++++++++++++++++++++++++");
		player.KillBoss();

	}
}
