#!/bin/bash
set -e

if ! which gcc; then
  echo "Please install OSX command line development tools"
  exit 1
fi

ruby -e "$(curl -fsSL https://raw.github.com/mxcl/homebrew/go)"

brew install zsh zsh-completions zsh-lovers zsh-syntax-highlighting
sudo bash -c "echo /usr/local/bin/zsh >> /etc/shells"
chsh -s /usr/local/bin/zsh
brew install git git-crypt git-flow gist
brew install irssi
brew install vim ctags
brew install chruby ruby-build
mkdir ~/.rubies
ruby-build 2.0.0-p247 ~/.rubies/2.0.0-p247
brew install phantomjs
brew install postgresql

#Install oh my zsh
curl -L https://github.com/robbyrussell/oh-my-zsh/raw/master/tools/install.sh | sh

cat << 'EOH' >> ~/.zshrc
ZSH_HIGHLIGHT_HIGHLIGHTERS=(main brackets pattern cursor)

source /usr/local/share/zsh-syntax-highlighting/zsh-syntax-highlighting.zsh
ZSH_HIGHLIGHT_STYLES[path]='fg=cyan'

ZSH_HIGHLIGHT_STYLES[cursor]='none'
ZSH_HIGHLIGHT_PATTERNS+=('rm -rf *' 'fg=white,bold,bg=red')

source $HOME/.profile

fpath=(/usr/local/share/zsh-completions $fpath)

bindkey "^R" history-incremental-search-backward
bindkey "^[[A" history-search-backward
bindkey "^[[B" history-search-forward

function svn-add-remove-all() {
  svn add \`svn stat | grep "?" | cut -d" " -f8 | xargs\`
  svn rm \`svn stat | grep "!" | cut -d" " -f8 | xargs\`
}

unsetopt correct
unsetopt correct_all
EOH

cat << 'EOH' >> ~/.profile
export EDITOR=/usr/local/bin/vim
export SVN_EDITOR=$EDITOR
source /usr/local/opt/chruby/share/chruby/chruby.sh
source /usr/local/opt/chruby/share/chruby/auto.sh
chruby 2.0.0-p247
EOH

#Install vimified
curl -L https://raw.github.com/zaiste/vimified/master/install.sh | sh

brew tap phinze/cask
brew install brew-cask
brew cask install alfred
open ~/Applications/Alfred\ 2.app
brew cask alfred link
brew cask install google-chrome
brew cask install textwrangler sublime-text
brew cask install virtualbox vagrant
brew cask install teamviewer
brew cask install skype adium dropbox
brew cask install spotify lastfm
brew cask install iterm2

echo "Setup complete. Now reopen your console in iterm2"