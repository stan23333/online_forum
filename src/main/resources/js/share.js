// shared.js

const sharedData = {
    message: 'Hello, world!'
};

const sharedMethods = {
    reverseMessage: function () {
        this.share.message = this.share.message.split('').reverse().join('');
    }
};
