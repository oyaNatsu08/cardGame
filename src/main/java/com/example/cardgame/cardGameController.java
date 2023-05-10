package com.example.cardgame;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.*;
import javafx.util.Duration;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cardGameController {

    @FXML
    private Label turn;
    @FXML
    private Label player1;
    @FXML
    private Label player2;
    @FXML
    private Image img;
    @FXML
    private ImageView card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12, card13;
    @FXML
    private ImageView card14, card15, card16, card17, card18, card19, card20, card21, card22, card23, card24, card25, card26;
    @FXML
    private ImageView card27, card28, card29, card30, card31, card32, card33, card34, card35, card36, card37, card38, card39;
    @FXML
    private ImageView card40, card41, card42, card43, card44, card45, card46, card47, card48, card49, card50, card51, card52;

    //プレイヤーのカード取得組数
    @FXML
    private Label countPlayer1;
    @FXML
    private Label countPlayer2;

    //トランプ作成
    Trump trump = new Trump();

    //プレイヤーを生成
    List<Player> players = new ArrayList<>(Arrays.asList(new Player("プレイヤー1", 0), new Player("プレイヤー2", 0)));

    //ターン内でカードを引いた回数
    private int drawCount;

    //引いたトランプを保持する
    private List<ImageView> drawImage = new ArrayList<>();

    //プレイヤーの手番を管理
    private int playerIndex;

    //カードの残り枚数
    private int leftCard = 52;

    @FXML
    private Label result;

    //ファイルのパスを受け取る
    String currentDirPath;

    @FXML
    public void initialize() {
        //プレイヤー名を表示
        player1.setText(players.get(0).getName());
        player2.setText(players.get(1).getName());

        //プレイヤーの初回手番を表示
        playerIndex = playerIndex % players.size();
        turn.setText(players.get(playerIndex).getName() + "の番");

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0.1), e -> result.setText("ゲームスタート！！")),
                new KeyFrame(Duration.seconds(3), e -> result.setText(""))
        );
        timeline.play();

        //プレイヤーの初回取得枚数を表示
        countPlayer1.setText("0");
        countPlayer2.setText("0");

        //ファイルのパスを受け取る
        File currentDir = new File("");
        currentDirPath = currentDir.getAbsolutePath();

        img = new Image(currentDirPath + "\\src\\main\\resources\\img\\card_back.png");
    }

    @FXML
    private void clickCard1() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(0) + ".png");
        card1.setImage(card);
        holdCard(card1);
    }
    @FXML
    private void clickCard2() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(1) + ".png");
        card2.setImage(card);
        holdCard(card2);
    }
    @FXML
    private void clickCard3() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(2) + ".png");
        card3.setImage(card);
        holdCard(card3);
    }
    @FXML
    private void clickCard4() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(3) + ".png");
        card4.setImage(card);
        holdCard(card4);
    }
    @FXML
    private void clickCard5() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(4) + ".png");
        card5.setImage(card);
        holdCard(card5);
    }
    @FXML
    private void clickCard6() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(5) + ".png");
        card6.setImage(card);
        holdCard(card6);
    }
    @FXML
    private void clickCard7() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(6) + ".png");
        card7.setImage(card);
        holdCard(card7);
    }
    @FXML
    private void clickCard8() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(7) + ".png");
        card8.setImage(card);
        holdCard(card8);
    }
    @FXML
    private void clickCard9() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(8) + ".png");
        card9.setImage(card);
        holdCard(card9);
    }
    @FXML
    private void clickCard10() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(9) + ".png");
        card10.setImage(card);
        holdCard(card10);
    }
    @FXML
    private void clickCard11() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(10) + ".png");
        card11.setImage(card);
        holdCard(card11);
    }
    @FXML
    private void clickCard12() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(11) + ".png");
        card12.setImage(card);
        holdCard(card12);
    }
    @FXML
    private void clickCard13() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(12) + ".png");
        card13.setImage(card);
        holdCard(card13);
    }
    @FXML
    private void clickCard14() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(13) + ".png");
        card14.setImage(card);
        holdCard(card14);
    }
    @FXML
    private void clickCard15() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(14) + ".png");
        card15.setImage(card);
        holdCard(card15);
    }
    @FXML
    private void clickCard16() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(15) + ".png");
        card16.setImage(card);
        holdCard(card16);
    }
    @FXML
    private void clickCard17() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(16) + ".png");
        card17.setImage(card);
        holdCard(card17);
    }
    @FXML
    private void clickCard18() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(17) + ".png");
        card18.setImage(card);
        holdCard(card18);
    }
    @FXML
    private void clickCard19() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(18) + ".png");
        card19.setImage(card);
        holdCard(card19);
    }
    @FXML
    private void clickCard20() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(19) + ".png");
        card20.setImage(card);
        holdCard(card20);
    }
    @FXML
    private void clickCard21() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(20) + ".png");
        card21.setImage(card);
        holdCard(card21);
    }
    @FXML
    private void clickCard22() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(21) + ".png");
        card22.setImage(card);
        holdCard(card22);
    }
    @FXML
    private void clickCard23() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(22) + ".png");
        card23.setImage(card);
        holdCard(card23);
    }
    @FXML
    private void clickCard24() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(23) + ".png");
        card24.setImage(card);
        holdCard(card24);
    }
    @FXML
    private void clickCard25() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(24) + ".png");
        card25.setImage(card);
        holdCard(card25);
    }
    @FXML
    private void clickCard26() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(25) + ".png");
        card26.setImage(card);
        holdCard(card26);
    }
    @FXML
    private void clickCard27() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(26) + ".png");
        card27.setImage(card);
        holdCard(card27);
    }
    @FXML
    private void clickCard28() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(27) + ".png");
        card28.setImage(card);
        holdCard(card28);
    }
    @FXML
    private void clickCard29() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(28) + ".png");
        card29.setImage(card);
        holdCard(card29);
    }
    @FXML
    private void clickCard30() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(29) + ".png");
        card30.setImage(card);
        holdCard(card30);
    }
    @FXML
    private void clickCard31() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(30) + ".png");
        card31.setImage(card);
        holdCard(card31);
    }
    @FXML
    private void clickCard32() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(31) + ".png");
        card32.setImage(card);
        holdCard(card32);
    }
    @FXML
    private void clickCard33() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(32) + ".png");
        card33.setImage(card);
        holdCard(card33);
    }
    @FXML
    private void clickCard34() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(33) + ".png");
        card34.setImage(card);
        holdCard(card34);
    }
    @FXML
    private void clickCard35() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(34) + ".png");
        card35.setImage(card);
        holdCard(card35);
    }
    @FXML
    private void clickCard36() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(35) + ".png");
        card36.setImage(card);
        holdCard(card36);
    }
    @FXML
    private void clickCard37() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(36) + ".png");
        card37.setImage(card);
        holdCard(card37);
    }
    @FXML
    private void clickCard38() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(37) + ".png");
        card38.setImage(card);
        holdCard(card38);
    }
    @FXML
    private void clickCard39() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(38) + ".png");
        card39.setImage(card);
        holdCard(card39);
    }
    @FXML
    private void clickCard40() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(39) + ".png");
        card40.setImage(card);
        holdCard(card40);
    }
    @FXML
    private void clickCard41() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(40) + ".png");
        card41.setImage(card);
        holdCard(card41);
    }
    @FXML
    private void clickCard42() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(41) + ".png");
        card42.setImage(card);
        holdCard(card42);
    }
    @FXML
    private void clickCard43() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(42) + ".png");
        card43.setImage(card);
        holdCard(card43);
    }
    @FXML
    private void clickCard44() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(43) + ".png");
        card44.setImage(card);
        holdCard(card44);
    }
    @FXML
    private void clickCard45() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(44) + ".png");
        card45.setImage(card);
        holdCard(card45);
    }
    @FXML
    private void clickCard46() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(45) + ".png");
        card46.setImage(card);
        holdCard(card46);
    }
    @FXML
    private void clickCard47() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(46) + ".png");
        card47.setImage(card);
        holdCard(card47);
    }
    @FXML
    private void clickCard48() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(47) + ".png");
        card48.setImage(card);
        holdCard(card48);
    }
    @FXML
    private void clickCard49() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(48) + ".png");
        card49.setImage(card);
        holdCard(card49);
    }
    @FXML
    private void clickCard50() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(49) + ".png");
        card50.setImage(card);
        holdCard(card50);
    }
    @FXML
    private void clickCard51() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(50) + ".png");
        card51.setImage(card);
        holdCard(card51);
    }
    @FXML
    private void clickCard52() {
        Image card = new Image(currentDirPath + "\\src\\main\\resources\\img\\" + trump.deck.get(51) + ".png");
        card52.setImage(card);
        holdCard(card52);
    }

    //2枚分の情報を保持する処理
    private void holdCard(ImageView card) {

        //引いたカードの情報を保持
        drawCount++;
        drawImage.add(card);

        //カードを引いたのが2枚目なら、数字が同じかチェック
        if (drawCount >= 2) {
            drawCount = 0;

            //同じトランプをクリックしてないか確かめる
            if (drawImage.get(0).toString().equals(drawImage.get(1).toString())) {
                //処理を二枚引いたから一枚引いたことに戻す
                drawCount = 1;
                drawImage.remove(1);
                return;
            }

            //トランプの数字のみ取得
            String num1 = drawImage.get(0).getImage().getUrl().replaceAll("\\D+", ""); // 文字以外を全て削除
            String num2 = drawImage.get(1).getImage().getUrl().replaceAll("\\D+", "");

            //数字が同じなら画像の中身を空にする
            if (num1.equals(num2)) {
                Timeline timeline = new Timeline(
                        new KeyFrame(Duration.seconds(1), e -> {
                            drawImage.get(0).setImage(null);
                            drawImage.remove(0);
                        }),
                        new KeyFrame(Duration.seconds(1), e -> {
                            drawImage.get(0).setImage(null);
                            drawImage.remove(0);
                        })
                );
                timeline.play();

                //プレイヤーの取得数をプラス１
                players.get(playerIndex).setGetCard(players.get(playerIndex).getCard + 1);

                //画面に取得数を表示
                countPlayer1.setText(players.get(0).getCard.toString());
                countPlayer2.setText(players.get(1).getCard.toString());

                //カードの残り枚数を減らす
                leftCard -= 2;

                //カード残り枚数が0になったら勝敗を表示する
                if ((leftCard <= 0) && (players.get(0).getCard > players.get(1).getCard)) {
                    result.setText(players.get(0).name + "の勝利です");
                } else if ((leftCard <= 0) && (players.get(0).getCard < players.get(1).getCard)) {
                    result.setText(players.get(1).name + "の勝利です");
                } else if ((leftCard <= 0) && (players.get(0).getCard.equals(players.get(1).getCard))) {
                    result.setText("引き分けです");
                }

            } else {
                Timeline timeline = new Timeline(
                        new KeyFrame(Duration.seconds(1), e -> {
                            drawImage.get(0).setImage(img);
                            drawImage.remove(0);
                        }),
                        new KeyFrame(Duration.seconds(1), e -> {
                            drawImage.get(0).setImage(img);
                            drawImage.remove(0);
                        })
                );
                timeline.play();

                //プレイヤーの手番を管理する
                playerIndex++;
                playerIndex = playerIndex % players.size();
            }

            turn.setText(players.get(playerIndex).getName() + "の番");

        }
    }
}
