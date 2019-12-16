should = require('chai').should();

function factorial(n) {
    let res = 1;
    while (n > 0) {
        res *= n;
        n--;
    }
    return res;
}

describe('Array', function () {
    describe('#indexOf()', function () {
        it('should return -1 when the value is not present', function () {
            [1, 2, 3].indexOf(5).should.equal(-1);
            [1, 2, 3].indexOf(0).should.equal(-1);
        });
        it('should return correct index when the value is present', function () {
            [1, 2, 3].indexOf(3).should.equal(2);
        });
    });
});

describe('factorial', function() {
    it('should return 1 if n is 0', function() {
        factorial(0).should.equal(1);
    });
    it('should return 1 if n is 1', function() {
        factorial(1).should.equal(1);
    });
    it('should return correct result if n is 10', function() {
        factorial(1).should.equal(3628800);
    })
});
