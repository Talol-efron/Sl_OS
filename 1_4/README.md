使用しているportの検索コマンド
lsof -P -i:8080

Port
80(httpの場合)
22(sshの場合)

localhost:8080に接続できない原因
fedora(vm)側でip a show コマンドで通信状況を確認すると、8080が通信できていないように見れる。
他のportでlocalhostにアクセスするとできる。(streamlit 8501) -> vm側の問題か
