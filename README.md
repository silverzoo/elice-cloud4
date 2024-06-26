# Git 명령어
```
git log
git init
git checkout -b 새 브랜치이름 (브랜치 생성)
git checkout 기존 브랜치이름 (브랜치 이동)
git checkout -d 기존 브랜치이름 (브랜치 삭제)
git add . (커밋할 파일 전체 올리기 untracked -> tracked)
git rm --cached 파일명 (tracked -> unstracked)
git commit -m "커밋 메시지"
git push --set-upstream origin 브랜치이름 (푸시하는 기본브랜치를 설정하기)
git push -u origin 브랜치이름 (위와 동일. 보통은 main을 쓴다)
git push (최초 푸시 이후 즉, 기본브랜치 설정 이후에는 이렇게 쓰면 된다)
git push <원격저장소> <브랜치이름> (기본설정 외의 다른 브랜치나 저장소에 푸시하고 싶을 때)
git remote add <name> <URL> (원격저장소로 사용하고 싶은 주소와 이름을 설정한다)
git clone <URL>
```
