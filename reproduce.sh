set -eux
BRANCH=$1
cat > instructions.txt <<EOF
git clone -b $BRANCH https://github.com/olafurpg/bsp-pants
cd bsp-pants
./setup-bsp.sh
EOF

cat instructions.txt | pbcopy
