BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "account" (
	"id"	INTEGER,
	"name"	TEXT NOT NULL UNIQUE,
	"age"	INTEGER NOT NULL UNIQUE,
	"sex"	INTEGER NOT NULL UNIQUE,
	"acc"	INTEGER NOT NULL UNIQUE,
	"pwd"	INTEGER NOT NULL UNIQUE,
	"check_pwd"	INTEGER NOT NULL UNIQUE,
	"Faraction"	INTEGER NOT NULL UNIQUE,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "diary" (
	"id"	INTEGER,
	"date"	TEXT NOT NULL UNIQUE,
	"content"	TEXT NOT NULL UNIQUE,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "Grading" (
	"id"	INTEGER,
	"score"	TEXT NOT NULL UNIQUE,
	"content"	TEXT NOT NULL UNIQUE,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "topic" (
	"id"	INTEGER,
	"topic_name"	TEXT NOT NULL UNIQUE,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "mood" (
	"id"	INTEGER,
	"way"	TEXT NOT NULL UNIQUE,
	"directions"	TEXT NOT NULL UNIQUE,
	PRIMARY KEY("id" AUTOINCREMENT)
);
INSERT INTO "Grading" ("id","score","content") VALUES (1,'得分0-10分','為一般正常範圍，表示身心適應狀況良好。'),
 (2,'得分11-18分','輕度情緒困擾，建議找家人或朋友談談，紓發情緒。'),
 (3,'得分19-28分','中度情緒困擾，建議尋求心理諮商或接受專業諮詢。'),
 (4,'得分29分以上或第6題得1分以上','重度情緒困擾，建議尋求心理諮商或接受精神科醫師治療。
');
INSERT INTO "topic" ("id","topic_name") VALUES (1,'睡眠困難，譬如難以入睡、易醒或早醒'),
 (2,'感覺緊張不安'),
 (3,'覺得容易苦惱或動怒'),
 (4,'感覺憂鬱、心情低落'),
 (5,'覺得比不上別人'),
 (6,'有自殺的想法'),
 (7,'我覺得很煩'),
 (8,'我不能專心'),
 (9,'我會莫名地想哭'),
 (10,'我對任何事都提不起勁'),
 (11,'我覺得記憶力變差了');
INSERT INTO "mood" ("id","way","directions") VALUES (1,'做深呼吸練習','透過深呼吸可以降低心跳和血壓，有助於放鬆身心。'),
 (2,'進行運動','運動可以釋放身體內的內啡肽和血清素等物質，有助於提高心情和減輕壓力。去尋找適合自己的運動吧!'),
 (3,'寫日記','將自己的想法和感受寫下來，可以釋放負面情緒，減少壓力和焦慮。'),
 (4,'練瑜珈或冥想','瑜珈和冥想等放鬆技巧可以幫助人放鬆身心，減少負面情緒和壓力。'),
 (5,'聆聽音樂','音樂有助於降低壓力和放鬆身心，選擇輕鬆愉悅的音樂來聆聽。'),
 (6,'與朋友保持聯繫','其實你不需要故作堅強而獨自掙扎，朋友很重要，特別是在遭逢生活低潮時，與他們聯絡吧！把心中的負面情緒跟一個懂自己、跟自己站在同一陣線的人分享，是放鬆心情、降低壓力的絕佳方式。'),
 (7,'接受你自己','做自己情緒的主人，別被其他人左右了自己的情緒，做好自己該做的事，讓自己立於不敗之地，就能夠讓自己越來越好。做自己情緒的主人，控制好的情緒，就能夠讓自己越來越快樂。'),
 (8,'學習新技巧','不論是為了娛樂、交友或增進工作機會，學習新技巧將有助於提昇你的自信。'),
 (9,'增加休息時間','適當增加休息和睡眠時間可以讓身體恢復和放鬆。');
COMMIT;
